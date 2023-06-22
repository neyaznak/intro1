package linkedList1;

import java.util.Scanner;

public class FindANodeInLinkedList {
	
	
    public static int findANodeInLinkedList(Node<Integer> head, int num) {
		
		int pos = 0;
		while(head != null) {
			if(head.data == num) {
				return pos;
			}
			head = head.next;
			pos++;
		}
    	return -1;
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
		int ans = findANodeInLinkedList(head, 2);
		System.out.println(ans);

	}

}
