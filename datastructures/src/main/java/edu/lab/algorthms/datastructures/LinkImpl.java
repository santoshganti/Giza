package edu.lab.algorthms.datastructures;

public class LinkImpl implements Link {

	private Link next;
	private Link previous;
	private Object key;

	public LinkImpl(Link previous, Object key, Link next) {
		this.previous = previous;
		this.key = key;
		this.next = next;
	}

	public Object getKey() {
		return key;
	}

	public Link getPrevious() {

		return previous;
	}

	public Link getNext() {

		return next;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

}
