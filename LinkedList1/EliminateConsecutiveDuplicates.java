package linkedList1;
import java.util.Scanner;

public class EliminateConsecutiveDuplicates {
    public static Node<Integer> removeConsecutiveDuplicates(Node<Integer> head) {
		
    	if(head == null) {
    		return head;
    	}
    	
    	Node<Integer> temp = head;
    	
    	while(temp.next != null) {
    		if(temp.data.equals(temp.next.data)) {
    			temp.next = temp.next.next;
    		}else {
    			temp = temp.next;
    		}
    	}
    	
		return head;
			
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
		head = removeConsecutiveDuplicates(head);
		print(head);
		
	}
}
