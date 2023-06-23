package linkedList1;
import java.util.Scanner;

public class MergeSort {
	
	public static void print(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
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
	
    public static Node<Integer> midpointOfLinkedList(Node<Integer> head) {
		
		Node<Integer> slow = head, fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> mid = midpointOfLinkedList(head);
		
		Node<Integer> half1 = head;
		Node<Integer> half2 = mid.next;
		mid.next = null;
		
		half1 = mergeSort(half1);
		half2 = mergeSort(half2);
		
		Node<Integer> finalHead = mergeTwoSortedLinkedLists(half1, half2);
		
		return finalHead;
		
	}

	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> finalHead =  mergeSort(head);
		print(finalHead);

	}

}
