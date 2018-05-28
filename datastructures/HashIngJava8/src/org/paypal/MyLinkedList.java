package org.paypal;


public class MyLinkedList<Entry> {
	int count=0;
	Node head;
	
	public MyLinkedList() {
		
	}
	
	class Node {
		Entry entry;
		Node nextNode;
		public Node(Entry entry) {
			this.entry = entry;
		}
		
	}
	
	public void add(Entry entry){
		if(count >7){
			addTree(entry);
			return;
		}
		Node node=new Node(entry);
		if(head==null){
			this.head=node;
			count++;
			return;
		}
		Node currentNode=head; 
		while(currentNode!=null){
			if(currentNode.nextNode==null){
				currentNode.nextNode=node;
				count++;
				break;
			}
		}
		}
	
	private void addTree(Entry entry){
		
	}

}
