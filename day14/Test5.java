import java.util.HashSet;

public class Test5 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		HashSet hs2=new HashSet();
		hs2.add(10);
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(1);
		hs.add(2);
		hs.add(100);
		hs.add(1000);
		hs.add(123);
		hs.add(321);
		hs.add(1234);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println(hs.containsAll(hs2));
		System.out.println(hs2.containsAll(hs));
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(1);
		hs.add(2);
		hs.add(100);
		hs.add(1000);
		hs.add(123);
		hs.add(321);
		hs.add(1234);
		
		System.out.println(hs);
		System.out.println(hs.size());
		
	}

}
