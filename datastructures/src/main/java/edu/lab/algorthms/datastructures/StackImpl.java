package edu.lab.algorthms.datastructures;

public class StackImpl {
	private int top;
	private int stackarray[];

	public StackImpl(int size) {
		stackarray = new int[size];
		top = -1;
	}

	public void push(int element) {
		if (top == stackarray.length - 1) {
			throw new StackOverflowException();
		} else {
			stackarray[++top] = element;
		}
	}

	/*
	 * ++top means "first increment top, then read its new value" top++ means
	 * "read the current value of top, then increment it"
	 * 
	 * e.g. top = -1; x = ++top;
	 * 
	 * will result in x=0, top=0
	 * 
	 * whereas: top = -1; x = top++;
	 * 
	 * will result in x=-1, top=0
	 */
	public int pop() {
		if (top == -1) {
			throw new StackUnderflowException();
		} else {
			return stackarray[top--];
		}
	}

}