package linkedList1;

import java.util.Scanner;

public class EvenAfterOddLinkedList {
	
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

	public static Node<Integer> evenAfterOddLinkedList(Node<Integer> head) {
		
		if(head == null) {
			return null;
		}
		
		Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
		
		while(head != null) {
			if(head.data % 2 == 0) {
				if(evenHead == null) {
					evenHead = head;
					evenTail = head;
				}else {
					evenTail.next = head;
					evenTail = evenTail.next;
				}
				
			}else {
				if(oddHead == null) {
					oddHead = head;
					oddTail = head;
				}else {
					oddTail.next = head;
					oddTail = oddTail.next;
				}
				
			}
			head = head.next;
		}
		
 	if(oddHead == null) {
 		return evenHead;
 	}else {
 		oddTail.next = evenHead;
 	}
 	
 	if(evenHead != null) {
 		evenTail.next = null;
 	}
		return oddHead;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		Node<Integer> ansHead = evenAfterOddLinkedList(head);
		print(ansHead);
		
	}
}
