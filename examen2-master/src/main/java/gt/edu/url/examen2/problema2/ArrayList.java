package gt.edu.url.examen2.problema2;

import java.util.Iterator;

public class ArrayList<E> implements List<E> {
	
	public static final int CAPACITY = 1;
	private E[] data;
	private int size = 0;
	 
	public ArrayList () {
		this(CAPACITY);
	}
	
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() { 
		return size == 0;
	}

	@Override
	public E get(int i) {
		//checkIndex(i, size);                
		return data[i];
	}
	@Override
	public E set(int i, E e) {
		//checkIndex(i, size);
		E temp = data[i];
                data[i] = null; 
		data[i] = e;
		return temp;
	}

	@Override
	public void add(int i, E e) {
		 		//checkIndex(i, size + 1);
				if (size == data.length) // not enough capacity
		 			resize(2 * data.length);
		 		for (int k = size - 1; k >= i; k--) // start by shifting rightmost
		 			data[k + 1] = data[k];
		 		data[i] = e; // ready to place the new element 
		 		size++;		 
	}

	@Override
	public E remove(int i) throws IndexOutOfBoundsException {
		 		//checkIndex(i, size);
		 		E temp = data[i];
		 		for (int k = i; k < size - 1; k++)
		 			data[k] = data[k + 1];
		 		data[size - 1] = null;
		 		size--;
		 		return temp;
	}
	
	protected void resize(int capacity) {
		 		E[] temp = (E[]) new Object[capacity];
		 		for (int k=0; k < size; k++)
		 			temp[k] = data[k];
		 		data = temp;
	}
	
	

}
