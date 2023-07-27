package queue;

public class Queue {
       Node head = null;
       Node tail = null;
       
       public boolean isEmpty() {
    	   return head ==null && tail ==null; 
       }
       
       public void add(int data) {
    	   Node newNode = new Node(data);
    	   
    	   if(head == null) {
    		   head = tail = newNode;
    		   return;
    	   }
    	   
    	   tail.next = newNode;
    	   tail = newNode ;
    	   
       }
       
       public int remove(){
    	 if(isEmpty()) {
    		 System.out.println("empty queue");
    		 return -1;
    	 }
    		 int front = head.data;
    		 
    		 if(tail == head) {
    			 tail = head = null;
    			 
    		 }else {
    			 head = head.next;
    		 }
    		 return front;
    	 }
    	   
       public int peek() {
    	   if(isEmpty()) {
    		   System.out.println("empty queue");
    		   return -1;
    	   }
    	   return head.data;
       }
    	   
    	   
       
}
