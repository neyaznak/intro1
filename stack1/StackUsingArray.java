package stack1;

public class StackUsingArray {
	
	private int[] data;
	private int top; // is the index of top most element of stack1
	
	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public boolean isEmpty() {
		
		return (top == -1); // if(top == -1) true else false
		
	}
	
	public int size() {
		return top + 1;
	}
	
	public int top() throws StackEmptyException {
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int element) throws StackFullException{
		if(size() == data.length) {
			//stack1 is full
			//StackFullException e = new StackFullException();
		    //throw e;
			doubleCapacity();
		}
		top++;
		data[top] = element;
		
	}
	
	private void doubleCapacity() {
		int[] temp = data;
		data = new int[2 * temp.length];
		for(int i = 0; i <= top; i++) {
			data[i] = temp[i];
		}
		
	}
	public int pop() throws StackEmptyException {
		if(size() == 0) {
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
		
	}
	
}
