package org.paypal;

import java.util.Set;

public interface Map<K,V> {
	
	public V put(K key, V value); 
	public V get(Object key );
	public Set<K> keySet();
	 Set<Map.Entry<K, V>> entrySet();
	 
	 interface Entry<K,V> {
		 K getKey();
		 V getValue();
		 Entry setKey(K key);
		 Entry setValue(V value);
	 }
	
	

}
