package LinkedList1;

import java.util.Scanner;

public class DeleteNode {
	
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
    	
    	if(head == null) {
    		return head;
    	}
    	
    	if(pos < 0) {
    		return head;
    	}
		
    	if(pos == 0) {
    		return head.next;
    	}
    	
		Node<Integer> temp = head;
		int i = 0;
		while(temp != null && i < (pos - 1)) {
			temp = temp.next;
			i++;
		}
		
		if(temp == null || temp.next == null) {
			return head;
		}
		
		temp.next = temp.next.next;
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
		Node<Integer> newHead = deleteNode(head, 2);
		print(newHead);

	}

}
