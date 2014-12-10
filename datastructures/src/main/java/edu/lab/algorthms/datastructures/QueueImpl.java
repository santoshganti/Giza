package edu.lab.algorthms.datastructures;

public class QueueImpl {

	private int queuearray[];
	private int tail;
	private int head;
	private int maxcapacity;

	public QueueImpl(int size) {
		queuearray = new int[size];
		tail = head = 0;
		maxcapacity = size + 1;
	}

	public void enqueue(int element) throws QueueFullException {
		if (isFull()) {
			throw new QueueFullException();
		} else {
			queuearray[tail] = element;
			tail = ((tail + 1) % maxcapacity);
		}
	}

	public int size() {
		return (maxcapacity - head + tail) % 2;
	}

	public int dequeue() throws QueueEmptyException{
		int element;
		if (isEmpty())
			throw new QueueEmptyException();
		else
			element = queuearray[head];
		queuearray[head] = 0;
		head = ((head + 1) % maxcapacity);

		return element;
	}

	public boolean isEmpty() {
		if (head == tail)
			return true;
		else
			return false;
	}
	
	public boolean isFull(){
		if (size() == maxcapacity - 1)
			return true;
		else
			return false;
	}
}
