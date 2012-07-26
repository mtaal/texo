/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ExampleModelBrowserServlet.java,v 1.1 2011/09/14 15:40:06 mtaal Exp $
 */
package org.eclipse.emf.texo.web.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.datagenerator.ModelDataGenerator;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.web.DataModelBrowserServlet;

/**
 * Example model browser servlet which is capable of generating test data also.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ExampleModelBrowserServlet extends DataModelBrowserServlet {
  private static final long serialVersionUID = 1L;

  @Override
  protected String generatePersistTestData(EPackage ePackage) {
    final List<EPackage> ePackages = Collections.singletonList(ePackage);
    final List<EClass> eClasses = DataGeneratorUtils.getRootEClasses(ePackages);

    final EMFModelConverter emfModelConverter = new EMFModelConverter();

    final ModelDataGenerator modelDataGenerator = new ModelDataGenerator();
    modelDataGenerator.setStartEClasses(eClasses);
    modelDataGenerator.setMaxDepth(10);
    modelDataGenerator.setCollectionSize(10);
    modelDataGenerator.setDataSize(10);
    modelDataGenerator.setMaxObjects(100000);
    modelDataGenerator.setEPackages(ePackages);
    modelDataGenerator.generateTestData();

    final StringBuilder sb = new StringBuilder();
    sb.append("<html><body>"); //$NON-NLS-1$
    sb.append("<h1>Generated " + modelDataGenerator.getTotalObjectCount() + " objects</h1><br/>"); //$NON-NLS-1$//$NON-NLS-2$

    final Map<EClass, Integer> countByEClass = new HashMap<EClass, Integer>();
    for (EObject eObject : modelDataGenerator.getAllEObjects()) {
      if (countByEClass.containsKey(eObject.eClass())) {
        countByEClass.put(eObject.eClass(), countByEClass.get(eObject.eClass()) + 1);
      } else {
        countByEClass.put(eObject.eClass(), 1);
      }
    }
    for (EClass eClass : countByEClass.keySet()) {
      sb.append(eClass.getName() + ": " + countByEClass.get(eClass) + "<br/>"); //$NON-NLS-1$//$NON-NLS-2$
    }

    sb.append("</body></html>"); //$NON-NLS-1$

    final List<Object> modelObjects = emfModelConverter.convert(modelDataGenerator.getResult());

    // persist everything
    final EntityManager entityManager = EntityManagerProvider.getInstance().createEntityManager();
    entityManager.getTransaction().begin();
    for (Object o : modelObjects) {
      entityManager.persist(o);
    }
    entityManager.getTransaction().commit();
    EntityManagerProvider.getInstance().releaseEntityManager(entityManager);

    return sb.toString();
  }
}
