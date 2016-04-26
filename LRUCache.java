package dataStructures;

import java.util.HashMap;

public class LRUCache {
    
 	HashMap<Integer,DLNode> map = new HashMap<Integer,DLNode>();
	DLNode head = null;
	DLNode end = null;
	int capacity = 0;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
	}
	
	public int get(int key){
		
		if(map.containsKey(key)){
			
			DLNode node = map.get(key);
			remove(node);
			setHead(node);
			return node.value;
		}
		return -1;
	}

	public void setHead(DLNode node) {
		node.next = head;
		node.pre = null;
		if(head!=null)
		head.pre = node;
		
		head = node;
		
		if(end==null)
			end = head;
		
		
	}

	public void remove(DLNode node) {
		if(node.pre!=null){
			node.pre.next = node.next;
		}
		else{
			head = node.next;
		}
		
		if(node.next!=null){
			
			node.next.pre = node.pre;
		}
		else{
			end = node.pre;
		}
		
	}
	
	public void set(int key, int value){
		
		if(map.containsKey(key)){
			
			DLNode node = map.get(key);
			node.value = value;
			remove(node);
			setHead(node);
		}
		else{
			DLNode newNode = new DLNode(key,value);
			if(map.size()>=capacity){
				
				map.remove(end.key);
				remove(end);
				setHead(newNode);
				
			}
			else{
				
				setHead(newNode);
			}
//			/System.out.println(map.get(2));
			map.put(key, newNode);
			
		}
	
	}
	
	public static void main(String [] args){
		LRUCache obj = new LRUCache(2);
		obj.set(2,1);
		obj.set(1,1);
		System.out.println(obj.get(2));
		obj.set(4,1);
		System.out.println(obj.get(1));
		System.out.println(obj.get(2));
		
		
	}
	
	
}

class DLNode{
	
	int key;
	int value;
	DLNode next;
	DLNode pre;
	
	public DLNode(int key, int value){
		
		this.key = key;
		this.value = value;
	}
	
}
