package linkedList1;
import java.util.Scanner;

public class DeleteNodeRecursively {
	
    public static Node<Integer> deleteNodeRecursively(Node<Integer> head, int pos) {
		
    	if(head == null) {
    		return head;
    	}
    	
    	if(pos == 0) {
    		return head.next;
    	}
    	
    	Node<Integer> smallHead = deleteNodeRecursively(head.next, pos - 1);
    	head.next = smallHead;
    	
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
		Node<Integer> newHead = deleteNodeRecursively(head, 3);
		print(newHead);

	}

	

}
