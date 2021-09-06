import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList alist=new ArrayList();
		alist.add(10);
		System.out.println(alist);
		alist.add(0, 20);
		System.out.println(alist);
		alist.add(3.14);
		alist.add('A');
		alist.add("apple");
		System.out.println(alist);
		System.out.println(alist.get(2));
		System.out.println(alist.get(4));
		alist.add(60);
		alist.add(0,70);
		System.out.println(alist);
		System.out.println(alist.size());
		alist.remove(1);
		System.out.println(alist);
		System.out.println(alist.size());
		System.out.println(alist.isEmpty());
		alist.clear();
		System.out.println(alist.isEmpty());
		System.out.println(alist);
		

	}

}
