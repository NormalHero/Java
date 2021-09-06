import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> llist=new LinkedList();
		llist.add(0);
		//System.out.println(llist);
		
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			if(num<=0) {
				break;
			}
			if(num%2==0) {
				llist.addLast(num);
			}
			else {
				llist.addFirst(num);
			}
			System.out.println(llist);
		}
		
		int sum=0;
		for(int v:llist) {
			sum+=v;
		}
		System.out.println("총합은 "+sum+"입니다.");
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
