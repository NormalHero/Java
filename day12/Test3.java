import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		String a="apple";
		String b="apple";
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열입력: ");
		b=sc.nextLine();
		
		if(a.equals(b)) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
		
		// 문자열 클래스(String)도 최상위 클래스 Object를 상속받음
		// equals()가 재정의되어있는 상태
		// -> 비교연산자 대신, equals() 메서드를 사용
		
		
	}

}
