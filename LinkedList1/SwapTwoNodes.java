package linkedList1;

import java.util.Scanner;

public class SwapTwoNodes {


	public static Node<Integer> swapTwoNodes(Node<Integer> head, int i, int j) {
		
		if(i == j) {
			return head;
		}
		
		
		
		Node<Integer> currentNode = head, prev = null;
		Node<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;
		
		int pos = 0;
		
		while(currentNode != null) {
			if(pos == i) {
				firstNodePrev = prev;
				firstNode = currentNode;
			}else if(pos == j) {
				secondNodePrev = prev;
				secondNode = currentNode;
			}
			
			prev = currentNode;
			currentNode = currentNode.next;
			pos += 1;
		}
		if(firstNodePrev != null) {
			firstNodePrev.next = secondNode;
		}else {
			head = secondNode;
		}
		if(secondNodePrev != null) {
			secondNodePrev.next = firstNode;
		}else {
			head = firstNode;
		}
		
		Node<Integer> currentFirstNode = secondNode.next;
		secondNode.next = firstNode.next;
		firstNode.next = currentFirstNode;
		
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
		Node<Integer> newHead = swapTwoNodes(head, 2,3);
		print(head);

	}
}
