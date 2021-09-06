import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		
		LinkedList llist=new LinkedList();
		llist.add(10);
		llist.add(0,20);
		llist.addFirst(30);
		llist.addLast(40);
		// llist.clear();
		System.out.println(llist);
		System.out.println(llist.contains(50));
		
		LinkedList llist2=new LinkedList();
		llist2.add(10);
		llist2.add(20);
		llist2.add(30);
		llist2.add(40);
		System.out.println(llist2);
		System.out.println(llist.equals(llist2)); // 요소의 순서를 따지는 equals()
		
		System.out.println(llist.get(1));
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		
		llist.push(11);
		System.out.println(llist.peek());
		System.out.println(llist);
		System.out.println(llist.pop());
		System.out.println(llist);
		
		llist.offer(12);
		System.out.println(llist.poll());
		System.out.println(llist);
		
		
		
		
	}

}
