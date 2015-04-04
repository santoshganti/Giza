package edu.lab.algorthms.datastructures;

public interface LinkedList {
	public void insert(Object key) throws LinkedListFullException;
	public boolean delete(Object key);
	public int size();
	public Link search(Object key);
	public boolean isEmpty();
	public Link getHead();
	public Link getTail();
}
