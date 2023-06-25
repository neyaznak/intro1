package linkedList1;
import java.util.Scanner;

public class DeleteN_NodesAfterEveryM_Nodes {
	
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

	public static Node<Integer> deleteN_NodesAfterEveryM_Nodes(Node<Integer> head, int M, int N) {
		if(M == 0 || head == null) {
			return null;
		}
		if(N == 0) {
			return head;
		}
		
		Node<Integer> currentNode = head;
		Node<Integer> temp = null;
		
		while(currentNode != null) {
			int take = 0, skip = 0;
			while(currentNode != null && take < M) {
				
				if(temp == null) {
					temp = currentNode;
				}else {
					temp.next = currentNode;
					temp = currentNode;
				}
				
				currentNode = currentNode.next;
				take += 1;
			}
			while(currentNode != null && skip <N) {
				currentNode = currentNode.next;
				skip += 1;
				
			}		
		}
		
		if(temp != null) {
			temp.next = null;
		}
		
		return null;
	}

	public static void main(String[] args) {
		
		Node<Integer> head = takeInput();
		Node<Integer> newHead = deleteN_NodesAfterEveryM_Nodes(head, 1, 2);
		print(head);
		
	}
}
