import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int menu;
		do{
			System.out.println("===메뉴 리스트===");
			System.out.println("1.아메리카노");
			System.out.println("2.카페라떼");
			System.out.println("3.프라푸치노");
			System.out.print("입력: ");
			menu=sc.nextInt();
		}while(menu<1 || 3<menu);

		switch(menu) {
		case 1:
			System.out.print("아메리카노");
			break;
		case 2:
			System.out.print("카페라떼");
			break;
		case 3:
			System.out.print("프라푸치노");
		}
		System.out.println(" 나왔습니다~!!");
		

	}

}
