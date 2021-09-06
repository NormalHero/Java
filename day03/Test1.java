import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이입력: ");
		int age=sc.nextInt();
		
		
		if(age<1||200<=age) {
			System.out.println("나이를 올바르게입력하셨는지 확인부탁드립니다!");
		}
		else {
			int fare=0;
			if(9<=age && age<=19) {
				fare=800;
				System.out.println(fare+"원입니다.");
			}
			else if(20<=age && age<=64) {
				fare=1300;
				System.out.println(fare+"원입니다.");
			}
			else {
				System.out.println(fare+"원입니다.");
			}
		}
		
		
	}

}
/*
1.올바르지않은 나이입력
-> 유효성검사

2.~~원에 대한 출력을 if문안으로 배치

3.else 추가

4. => "하나의 조건식"으로 묶음

5. => or [중첩]
*/