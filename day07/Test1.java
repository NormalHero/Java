import java.util.Scanner;

public class Test1 {

	static boolean func(int v) {
		
		//return v%2==1?true:false;
		//return v%2==1;
		
		if(v%2==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// main()에서 정수 값을 1개씩 입력
		// 0보다 작은 정수가 입력되면 다시입력
		// 0이 입력되면 프로그램 종료
		// 0보다 큰 정수 입력 -> 홀/짝 판별함수 호출 => 홀수만 더해주세요!~~
		// 프로그램이 종료되었을때, 총합을 출력!

		Scanner sc=new Scanner(System.in);

		int res=0;
		while(true) {
			int v;
			do {
				System.out.print("정수입력: ");
				v=sc.nextInt();
			}while(v<0);
			
			if(v==0) {
				break;
			}
			
			if(func(v)) {
				res+=v;
			}
		}
		System.out.println("총합은 "+res+"입니다.");


	}

}
