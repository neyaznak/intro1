package LinkedList1;

import java.util.Scanner;

public class PrintIthNode {
	
	public static void printIthNode(Node<Integer> head, int pos) {
		int i = 0;
		Node<Integer> temp = head;
		while(i < pos ) {
			temp = temp.next;
			i++;
		}
		if(temp !=null) {
			System.out.println(temp.data);
		}else {
			System.out.println("Not found");
		}
		
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
		printIthNode(head, 4);
		
	}

}
