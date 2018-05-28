package org.paypal;

import org.paypal.MyHashMap.Entry;

public class TreeMap<K,  V> {
	
	class Node<K, V> {
		Entry  entry;
		Node leftNode;
		Node rightNode;
		public Node(Entry entry) {
			this.entry = entry;
		}
		
	} 
	
	Node root;
	
	public V add(Entry entry){
		Node node=new Node(entry);
		if(root==null){
			root=node;
			return null;
		}
		Node currentEntry=root;
		
		while(currentEntry!=null){
			if(currentEntry.entry.key.hashCode() > entry.key.hashCode() ){
				if(currentEntry.leftNode==null){
					currentEntry.leftNode=node;
					return null;
				}
				currentEntry=currentEntry.leftNode;
			}else if (currentEntry.entry.key.hashCode() < entry.key.hashCode()){
				if(currentEntry.rightNode==null){
					currentEntry.rightNode=node;
					return null;
				}
				currentEntry=currentEntry.rightNode;
			}else{
				if(currentEntry.entry.key.equals(entry.key)){
					V vv=(V) currentEntry.entry.value;
					currentEntry.entry.value=entry.value;
					return vv;
				}else{
					/** if hascode is same and containtents not same 
					 **/
					currentEntry=currentEntry.leftNode;
				}
			}
			
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
		Entry ent=new Entry(1, "ss");
		tree.add(ent)
	}
	
	
	
	

}
