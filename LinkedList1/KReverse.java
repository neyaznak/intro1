package linkedList1;

import java.util.Scanner;

public class KReverse {
	
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


	private static Node<Integer> kReverse(Node<Integer> head, int K) {
		if(K == 0 || K == 1) {
			return head;
		}
		
		Node<Integer> current = head;
		Node<Integer> fwd = null;
		Node<Integer> prev = null;
		
		int count = 0;
		
		while(count < K && current != null) {
			fwd = current.next;
			current.next = prev;
			prev = current;
			current = fwd;
			count++;
		}
		if(fwd != null) {
			head.next = kReverse(fwd, K);
		}
		
		return prev;
	}
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		Node<Integer> newHead = kReverse(head, 3);
		print(newHead);
				

	}
}
