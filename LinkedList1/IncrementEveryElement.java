package linkedList1;

import java.util.Scanner;

public class IncrementEveryElement {
	
	public static void incrementAllElems(Node<Integer> head) {
		
		Node<Integer> temp = head;
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
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
		incrementAllElems(head);
		print(head);
		
	}

	

}
