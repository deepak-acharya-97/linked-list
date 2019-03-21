package linkedlist.utilities;

import linkedlist.node.Node;

public class Utilities {

	public static class Utility {
		public static Node ReverseLinkedList(Node root) {
			Node curr=root, next=null, prev=null;
			while(curr != null) {
				next=curr.getNext();
				curr.setNext(prev);
				prev=curr;
				curr=next;
			}
			return prev;
		}
		public static Node getMidElement(Node root) {
			Node slowPointer = root;
			Node fastPointer = root;
			while(fastPointer.getNext() != null || fastPointer != null) {
				slowPointer = root.getNext();
				fastPointer = root.getNext().getNext();
			}
			return slowPointer;
		}
	}

}
