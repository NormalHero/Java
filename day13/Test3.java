import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			if(num==0) {
				break;
			}
			alist.add(num);
		}
		System.out.println(alist);
		
		int sum=0;
		for(int i=0;i<alist.size();i++) {
			sum+= alist.get(i);
		}
		System.out.println("총합은 "+sum+"입니다.");
		
		for(int v:alist) {
			System.out.println(v);
		}
		
		
	}

}
