package org.paypal;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyHashMap<K,V> implements Map<K, V> {
	LinkedList<Entry> arry[];
	int size=16;
	
	public class Entry implements Map.Entry<K, V>{
		public K key;
		public V value;
		public Entry(K key,V value) {
			this.key=key;
			this.value=value;
		}
		@Override
		public K getKey() {
			return this.key;
		}
		@Override
		public V getValue() {
			return this.value;
		}
		@Override
		public org.paypal.Map.Entry setKey(K key) {
			this.key=key;
			return this;
		}
		@Override
		public org.paypal.Map.Entry setValue(V value) {
			this.value=value;
			return this;
		}
	}
	

	public MyHashMap() {
		arry=new LinkedList[size];
	}

	public V put(K key, V value){
		V retunvalue=null;
		if(key==null){
			if(arry[0]==null){
				LinkedList list=new LinkedList();
				list.add(new Entry(null, value));
				arry[0]=list;
			}else{
				retunvalue=arry[0].get(0).value;
				LinkedList list=new LinkedList();
				list.add(new Entry(null, value));
				arry[0]=list;
				return retunvalue;
			}
			return null;
		}
		int index=hash(key.hashCode());
		if(arry[index]==null){
			LinkedList<Entry> list=new LinkedList<Entry>();
			list.add(new Entry(key, value));
			arry[index]=list;
		}else{
			LinkedList<Entry> list= arry[index];
			for(Entry entry:list){
				if(entry.key.hashCode()==key.hashCode()){
					if(entry.key.equals(key)){
						retunvalue=entry.value;
						entry.value=value;
						return retunvalue;
					}
				}				
			}
			list.add(new Entry(key, value));
		}

		return null;
	}

	private int hash(int hashcode){
		return hashcode%size;
	}
	
	public V get(Object key){
		int index=hash(key.hashCode());
		LinkedList<Entry> list=arry[index];
		for(Entry entry:  list){
			if(entry.key.hashCode()==key.hashCode()){
				if(entry.key.equals(key)){
					return entry.value;
				}
			}
		}
		return null;
		
	}
	
	@Override
	public String toString() {
		String str="{";
		for(int i=0; i < arry.length ; i++)
		{
			if(arry[i]!=null){
				LinkedList<Entry> list=arry[i];
				for(Entry enty: list){
					str+=enty.key+"="+enty.value+",";
				}
			}
		}
		str=str.substring(0,str.length()-1);
		return str+"}";
	}
	
	@Override
	public Set<K> keySet() {
		Set<K> keyset=new HashSet<K>();
		for(int i=0; i<arry.length; i++){
			LinkedList<MyHashMap<K, V>.Entry> list=arry[i];
			if(list!=null){
			for(org.paypal.Map.Entry<K, V> enty:list){
				keyset.add(enty.getKey());
			}
			}
		}		
		return keyset;
	}

	@Override
	public Set<org.paypal.Map.Entry<K, V>> entrySet() {
		Set<org.paypal.Map.Entry<K, V>> entryset=new HashSet<org.paypal.Map.Entry<K, V>>();
		for(int i=0; i<arry.length; i++){
			LinkedList<MyHashMap<K, V>.Entry> list=arry[i];
			if(list!=null){
			for(org.paypal.Map.Entry<K, V> enty:list){
				entryset.add(enty);
			}
			}
		}		
		return entryset;
	}
}