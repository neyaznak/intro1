package linkedList1;

import java.util.Scanner;

public class ReverseLLRecursively {
	
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
	
	public static Node<Integer> reverseLLRecursively(Node<Integer> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> finalHead = reverseLLRecursively(head.next);
		Node<Integer> temp = finalHead;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head; // since originally head was pointing to 1st node
		head.next = null; // since 1-2-3-4 is now 4-3-2-1----2----1 ..... infinitel therefore we are pointing 1 to null i.e, making it the tail
		return finalHead;
	}

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		Node<Integer> finalHead = reverseLLRecursively(head);
		print(finalHead);

	}

}
