package gt.edu.url.examen2.problema5;
import java.util.EmptyStackException;


public class DynamicStack<E> implements Stack<E> {
	
	 private final int CAPACITY = 1;
	   private int Size;  // indicates the next open slot
	   private E[] data; 

	
	   public DynamicStack() {
		   Size = 0;
		   data = (E[])(new Object[CAPACITY]);
	   }

	   
	   public DynamicStack (int initialCapacity) {
		   Size = 0;
		   data = (E[])(new Object[initialCapacity]);
	   }

	
	@Override
	  public int size() {
		return Size;
	   }

	@Override
	 public boolean isEmpty() {
		return (Size == 0);
	   }
	
	@Override
	 public void push (E e) {
	      if (size() == data.length) {
	    	  resize(2*data.length);
		      data[Size] = e;
		      Size++;
	      }
	         
	      else {
	    	  data[Size] = e;
		      Size++;
	      }
	    	 
	   }

	@Override
	public E top() {
		if (isEmpty())
	         throw new EmptyStackException();
	       return data[Size -1];
	}
	
	@Override
	  public E pop() throws EmptyStackException {
	      if (isEmpty())
	         throw new EmptyStackException();
	      else 
	      Size--;
	      E res = data[Size];
	      data[Size] = null; 	 
	      return res;
	   }	

	 
	  void resize(int capacity) {
		 		E[] temp = (E[]) new Object[capacity];
		 		for (int i=0; i < Size; i++)
		 			temp[i] = data[i];
		 		data = temp;
	  }
	

}
