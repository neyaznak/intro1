package linkedList1;

import java.util.Scanner;

public class PrintReversedLinkedList {
	
    public static void printReversedLinkedList(Node<Integer> head) {
		
		if(head == null) {
			return;
		}
		printReversedLinkedList(head.next);
		System.out.print(head.data+" ");
		
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
		printReversedLinkedList(head);

	}

	

}
