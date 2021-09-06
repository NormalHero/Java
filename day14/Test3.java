import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		
		s.push(10);
		s.push(10);
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(40);
		System.out.println(s.pop());
		
		
		Queue q=new LinkedList();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
