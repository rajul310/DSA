 package queue;

public class Main {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.add(1);
		q.add(2);
		q.add(3);
		
		q.remove();
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
