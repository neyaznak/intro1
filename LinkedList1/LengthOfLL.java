package LinkedList1;

import java.util.Scanner;

public class LengthOfLL {
	
	
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
		lengthOfLinkedList(head);

	}

	public static void lengthOfLinkedList(Node<Integer> head) {
		
		if(head == null) {
			System.out.println("null");
		}
		
		Node<Integer> temp = head;
		int count = 1;
		
		while(temp.next != null) {
			temp = temp.next;
			count++;
		}
		System.out.println("Length of this linked list is: "+ count);
		
		
	}

}
