import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이입력: ");
		int age=sc.nextInt();
		
		int fare=0;
		
		if(9<=age && age<=19) {
			fare=800;
		}
		else if(20<=age && age<=64) {
			fare=1300;
		}
		
		
		System.out.println(fare+"원입니다.");
		
		
	}

}
