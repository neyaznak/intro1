package linkedList1;
import java.util.Scanner;

public class ReverseLLBetter {
	
	public static DoubleNode reverseLLBetter(Node<Integer> head) {
		if(head == null || head.next == null) {
			DoubleNode ans = new DoubleNode();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode smallAns = reverseLLBetter(head.next);
		smallAns.tail.next = head;
	    head.next = null;
	    
	    DoubleNode ans = new DoubleNode();
	    ans.head = smallAns.head;
	    ans.tail = head;
	    return ans;
	    
	    
	}
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
    public static Node<Integer> takeInput() {
		
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {

				tail.next = newNode;
				tail = newNode; 
			}
			data = s.nextInt();
		}
		return head;	
	}

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		
		DoubleNode ans = reverseLLBetter(head);
		print(ans.head);

	}

}
