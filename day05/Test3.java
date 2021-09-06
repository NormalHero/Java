import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		int[] menu=new int[3];
		/*
		menu[0]=3000;
		menu[1]=4000;
		menu[2]=2500;
		
		int[] menu2= {3000,4000,2500};
		
		System.out.println("배열의 길이/크기/요소의 개수: "+menu.length);
		
		System.out.println("==메뉴목록==");
		for(int i=0;i<menu.length;i++) {
			System.out.println(i+1+"번메뉴는 "+menu[i]+"원입니다.");
		}
		*/
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<menu.length;i++) {
			System.out.print("메뉴가격입력: ");
			menu[i]=sc.nextInt();
		}
		
		// for-Each문==향상된 for문
		
		for(int v:menu) {
			System.out.println(v);
		}
		
		
		
		

	}

}
