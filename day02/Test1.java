import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int i=sc.nextInt();
		
		System.out.println("입력하신 정수는 ["+i+"]입니다.");
		
		
		System.out.print("실수입력: ");
		double d=sc.nextDouble();
		
		System.out.println("입력하신 실수는 ["+d+"]입니다.");	
				
		
		sc.nextLine(); // 버퍼공간의 불필요한 공백값(엔터키입력)을 가져감
		System.out.print("문자열입력: ");
		String str=sc.nextLine();
		
		System.out.println("입력하신 단어는 ["+str+"]입니다.");
		
		
		
		
		
		
	}

}
