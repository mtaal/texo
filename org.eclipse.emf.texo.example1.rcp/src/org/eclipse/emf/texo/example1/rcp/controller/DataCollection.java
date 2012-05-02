package org.eclipse.emf.texo.example1.rcp.controller;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

public abstract class DataCollection<E extends EObject> {
	// Data
	protected E current; // data currently edited
	private EList<E> selection = new BasicEList<E>();; // selection of the list
	private EList<E> list = new BasicEList<E>(); // complete data of this type

	// adapters
	private static EList<EContentAdapter> currentAdapters = new BasicEList<EContentAdapter>();
	private static EList<EContentAdapter> selectionAdapters = new BasicEList<EContentAdapter>();
	private static EList<EContentAdapter> listAdapters = new BasicEList<EContentAdapter>();

	/*
	 * ADD REMOVE ELEMENTS
	 */

	public E getCurrent() {
		return current;
	}

	/**
	 * implement this and add the adapter to ALL childs.
	 * 
	 * @param current
	 */
	public abstract void setCurrent(E current);

	public EList<E> getSelection() {
		return selection;
	}

	public void setSelection(EList<E> list) {
		selection = list;
	}

	public EList<E> getList() {
		return list;
	}

	public void setList(EList<E> list) {
		// working? other wise clear() and addAll(list)
		this.list = list;
	}

	public void addToSelection(E e) {
		selection.add(e);
	}

	public void removeFromSelection(E e) {
		selection.remove(e);
	}

	public void addToList(E e) {
		list.add(e);
		Controller.getResource().getContents().add(e);
	}

	public void removeFromList(E e) {
		list.add(e);
		Controller.getResource().getContents().add(e);
	}

	/*
	 * ADAPTERS
	 */
	public void addCurrentAdapter(EContentAdapter a) {
		currentAdapters.add(a);
	}

	public void removeCurrentAdapter(EContentAdapter a) {
		currentAdapters.remove(a);
	}

	public void addSelectionAdapter(EContentAdapter a) {
		selectionAdapters.add(a);
	}

	public void removeSelectionAdapter(EContentAdapter a) {
		selectionAdapters.remove(a);
	}

	public void addListAdapter(EContentAdapter a) {
		listAdapters.add(a);
	}

	public void removeListAdapter(EContentAdapter a) {
		listAdapters.remove(a);
	}

	public EList<EContentAdapter> getCurrentAdapters() {
		return currentAdapters;
	}

	// public EList<EContentAdapter> getSelectionAdapters() {
	// return selectionAdapters;
	// }
	//
	// public EList<EContentAdapter> getListAdapters() {
	// return listAdapters;
	// }
}