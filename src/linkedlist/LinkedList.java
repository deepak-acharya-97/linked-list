package linkedlist;

import linkedlist.generation.Generate.GenerateLinkedList;
import linkedlist.node.Node;
import linkedlist.utilities.Utilities.Utility;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println("Hi");
		Node head=GenerateLinkedList.generateFromArray(arr);
		System.out.println(head.getData());
		Node mid = Utility.getMidElement(head);
		System.out.println(mid.getData());
		Node end = Utility.ReverseLinkedList(mid);
		SwapElements(head, mid, end);
	}

	private static void SwapElements(Node head, Node mid, Node end) {
		// TODO Auto-generated method stub
		Node tempHead=head;
		while(head.getNext() != mid ) {
			Node temp=head.getNext();
			head.setNext(end);
			head.getNext().setNext(temp);
			head=head.getNext();
			end=end.getNext();
		}
		head.setNext(end);
		printLinkedList(tempHead);
	}

	private static void printLinkedList(Node root) {
		// TODO Auto-generated method stub
		while(root != null) {
			System.out.println(root.getData());
		}
	}

}
