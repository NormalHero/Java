import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> alist=new ArrayList();
		System.out.print("개수입력: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			alist.add(num);
		}
		
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			System.out.print(alist.get(i)+" ");
		}
		System.out.println();
		
		for(int v:alist) {
			System.out.print(v+" ");
		}
		System.out.println();
		
		
		
		// [이터레이터 / 반복자]
		//  : 컬렉션에 구현된 것으로, 주로 출력확인 용도로 활용됨
		Iterator itr=alist.iterator();
		// hasNext(): 남아있는 객체가 존재합니까?
		// next(): 저장된 객체 리턴(반환)
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// itr == 컬렉션을 복사한 객체이다!
		// itr를 통해서 본래의 컬렉션에 저장된 정보에 영향을 줄수가없음
		
		
		
		
		
		
		
		
	}

}
