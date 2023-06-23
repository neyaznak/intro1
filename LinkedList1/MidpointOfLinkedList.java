package linkedList1;
import java.util.Scanner;

public class MidpointOfLinkedList {
	
	public static Node<Integer> midpointOfLinkedList(Node<Integer> head) {
		
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
		Node<Integer> midpoint = midpointOfLinkedList(head);
		System.out.println(midpoint.data);
	
	}
}
