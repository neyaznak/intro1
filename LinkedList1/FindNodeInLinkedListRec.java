package linkedList1;

import java.util.Scanner;

public class FindNodeInLinkedListRec {
	
	public static int findNodeInLinkedListRec(Node<Integer> head, int n) {
		
		if(head == null) {
			return -1;
		}
		if(head.data == n) {
			return 0;
		}
		
		int smallIndex = findNodeInLinkedListRec(head.next, n);
		
		if( smallIndex == -1) {
			return -1;
		}
		
		return smallIndex + 1;
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
		
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		int n = s.nextInt();
		int index = findNodeInLinkedListRec(head, n);
		System.out.println(index);

	}
}
