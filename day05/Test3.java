import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		int[] menu=new int[3];
		/*
		menu[0]=3000;
		menu[1]=4000;
		menu[2]=2500;
		
		int[] menu2= {3000,4000,2500};
		
		System.out.println("�迭�� ����/ũ��/����� ����: "+menu.length);
		
		System.out.println("==�޴����==");
		for(int i=0;i<menu.length;i++) {
			System.out.println(i+1+"���޴��� "+menu[i]+"���Դϴ�.");
		}
		*/
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<menu.length;i++) {
			System.out.print("�޴������Է�: ");
			menu[i]=sc.nextInt();
		}
		
		// for-Each��==���� for��
		
		for(int v:menu) {
			System.out.println(v);
		}
		
		
		
		

	}

}
