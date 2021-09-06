import java.util.Random;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// [정렬_버블정렬,거품정렬]
		// : 알고리즘

		// -> "검색,탐색"을 용이하게 하기위해서!

		int[] data=new int[5];
		Random rand=new Random();
		for(int i=0;i<data.length;i++) {
			data[i]=rand.nextInt(100)+1;
		}
		for(int v:data) {
			System.out.print(v+" ");	
		}
		System.out.println();

		// [정렬]
		for(int a=0;a<data.length;a++) {
			for(int i=0;i<data.length-1;i++) { // 2개의 데이터를 묶어서 "비교"하는 수행
				if(data[i]>data[i+1]) {
					// [교환]->"임시저장변수"
					int tmp=data[i];
					data[i]=data[i+1];
					data[i+1]=tmp;
				}
			} // 1회전정렬 => 데이터의 개수만큼 반복!
		}

		for(int v:data) {
			System.out.print(v+" ");	
		}


		// [탐색,검색]
		// 이진탐색,이분검색
		// => 조건: "정렬"이 되어있는가?

		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 데이터입력: ");
		int num=sc.nextInt();

		int start=0;
		int end=data.length-1; // 1. start/end 지점 설정
		while(true) {
			int mid=(start+end)/2; // 2. mid지점 설정

			if(data[mid]==num) { // <-- 내가 찾으려는값과 일치?
				System.out.print("찾았다! ");
				System.out.println("["+mid+"]");
				break;
			}
			else if(data[mid]<num) {
				System.out.println("크다.");
				start=mid+1;
			}
			else {
				System.out.println("작다.");
				end=mid-1;
			}
		}








	}

}
