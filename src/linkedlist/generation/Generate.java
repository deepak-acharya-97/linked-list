package linkedlist.generation;

import linkedlist.node.Node;

public class Generate {

	public static class GenerateLinkedList {
		public static Node generateFromArray(int[] arr) {
			if(arr.length == 0) return null;
			Node head = new Node(arr[0]);
			Node headCopy = head;
			for(int i=1; i<arr.length; i++) {
				Node temp = new Node(arr[i]);
				head.setNext(temp);
				head=temp;
			}
			return headCopy;
		}
	}

}
