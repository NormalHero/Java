import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// switch문
		/*
		switch(변수 / 값) {
		case 1:
			///
		case 2:
			///
		case 3:
			///	
		}		
		*/
		/*
		int i=3;
		
		switch(i) {
		case 1:
			System.out.println("하나!");
			//break;
		case 2:
			System.out.println("둘!");
			break;
		case 3:
			System.out.println("셋!");
			break;
		default:
			System.out.println("해당없음");	
		}
		
		
		
		
		
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
		
		*/
		
		System.out.print("월을 입력하세요.  ");
		int month=sc.nextInt();
		String w;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			w="겨울";
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			w="봄";
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			w="여름";
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			w="가을";
			break;
		default:
			System.out.println("유효하지않은 월입력입니다!");
			w="유효하지않은 월";
		}
		
		
		System.out.println(w+" 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
