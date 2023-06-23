package linkedList1;

import java.util.Scanner;

public class ReverseLL3 {
	
	public static Node<Integer> reverseLLR(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> reversedTail = head.next;
		Node<Integer> smallHead = reverseLLR(head.next);
		reversedTail.next = head;
		head.next= null;
		
		return smallHead;
		
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
		head = reverseLLR(head);
		print(head);

	}

}
