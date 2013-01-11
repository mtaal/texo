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
 * $Id: TexoWebExampleContextListener.java,v 1.2 2011/09/14 15:40:06 mtaal Exp $
 */
package org.eclipse.emf.texo.web.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.test.model.samples.library.LibraryModelPackage;

/**
 * Context listener to make sure that the correct {@link ModelPackage} instances are initialized.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class TexoWebExampleContextListener implements ServletContextListener {

  @Override
  public void contextDestroyed(ServletContextEvent arg0) {
  }

  @Override
  public void contextInitialized(ServletContextEvent arg0) {
    ServiceModelPackageRegistry.getInstance().register(LibraryModelPackage.INSTANCE);
    EntityManagerProvider.getInstance().setPersistenceUnitName("library-derby2"); //$NON-NLS-1$
    // initialize aggressively
    EntityManagerProvider.getInstance().initialize();
  }
}
