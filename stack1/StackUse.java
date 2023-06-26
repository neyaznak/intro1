package stack1;
import stack2.*;
public class StackUse {

	public static void main(String[] args) throws StackFullException {
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();
		//StackUsingArray stack = new StackUsingArray(3);
		for(int i = 1; i <= 5; i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			try {
				System.out.print(stack.pop()+" ");
			} catch (StackEmptyException e) {
				// never reach here
			}
		}

	}

}
