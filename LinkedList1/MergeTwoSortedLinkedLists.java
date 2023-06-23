package linkedList1;

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
	
	public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		
		if(head1 == null) {
			return head2;
		}
		if(head2 == null) {
			return head1;
		}
		
		Node<Integer> temp1 = head1, temp2 = head2, head3 = null, tail3 = null;
		
		if(temp1.data <= temp2.data) {
			head3 = temp1;
			tail3 = temp1;
			temp1 = temp1.next;
		}else {
			head3 = temp2;
			tail3 = temp2;
			temp2 = temp2.next;
		}
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data <= temp2.data) {
				tail3.next = temp1;
				tail3 = temp1;
				temp1 = temp1.next;
			}else {
				tail3.next = temp2;
				tail3 = temp2;
				temp2 = temp2.next;
			}
		}
		
		if(temp1 != null) {
			tail3.next = temp1;
		}else {
			tail3.next = temp2;
		}
		
		return head3;
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
		
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		
		Node<Integer> mergedHead = mergeTwoSortedLinkedLists(head1, head2);
		print(mergedHead);

	}
}
