package edu.lab.algorthms.datastructures;

public class LinkedListImpl implements LinkedList {
	private LinkImpl currenthead;
	private LinkImpl tail;
	private int maxCapacity;
	private int size;

	public LinkedListImpl(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public void insert(Object key) throws LinkedListFullException {
		if (size == maxCapacity) {
			throw new LinkedListFullException();
		}
		if (currenthead == null) {
			LinkImpl link = new LinkImpl(null, key, null);
			currenthead = link;
			tail = link;
		} else {
			LinkImpl currentlink = new LinkImpl(null, key, currenthead);
			currenthead.setPrevious(currentlink);
			currenthead = currentlink;
		}
		size++;

	}

	public boolean delete(Object key) {
		Link linkToDelete = search(key);
		if (linkToDelete == null) {
			return false;
		} else {
			LinkImpl previousLink = (LinkImpl) linkToDelete.getPrevious();
			LinkImpl nextLink = (LinkImpl) linkToDelete.getNext();
			if (previousLink != null) {
				previousLink.setNext(nextLink);
			} else {

			}
		}

	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Link search(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Link getHead() {
		// TODO Auto-generated method stub
		return null;
	}

	public Link getTail() {
		// TODO Auto-generated method stub
		return null;
	}

}
