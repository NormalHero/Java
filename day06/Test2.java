import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// �������迭==�������迭
		/*
		int[] stu1= {10,20,30};
		int[] stu2= {11,12,13};
		int[] stu3= {20,22,24};
		 */


		int[][] stu= {{10,20,30},{11,12,13},{20,22,24}};


		int[][] stu2=new int[3][3];

		Scanner sc=new Scanner(System.in);

		for(int a=0;a<stu2.length;a++) {
			System.out.println(a+1+"��°�л��� �����Է���...");
			for(int i=0;i<stu2[a].length;i++) {
				System.out.print(i+1+"��°���輺���Է�: ");
				stu2[a][i]=sc.nextInt();
			}
			System.out.println();
		}


	}

}
