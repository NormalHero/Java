import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		int[][] stu=new int[3][2];

		Scanner sc=new Scanner(System.in);
		for(int a=0;a<stu.length;a++) {
			System.out.println(a+1+"��° �л��� �����Է���...");
			for(int i=0;i<stu[a].length;i++) {
				System.out.print(i+1+"��° ���輺���Է�: ");
				stu[a][i]=sc.nextInt();
			}
			System.out.println();
		}

		for(int a=0;a<stu.length;a++) {
			int sum=0;
			System.out.print(a+1+"���л�: [ ");
			for(int i=0;i<stu[a].length;i++) {
				System.out.print(stu[a][i]+"�� ");
				sum+=stu[a][i];
			}
			double avg=sum*1.0/stu[a].length;
			System.out.println("] ��������� "+avg+"���Դϴ�.");
			
		}
		
		
		
		
	}

}
