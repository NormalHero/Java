import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		int[][] stu=new int[3][2];

		Scanner sc=new Scanner(System.in);
		for(int a=0;a<stu.length;a++) {
			System.out.println(a+1+"번째 학생의 성적입력중...");
			for(int i=0;i<stu[a].length;i++) {
				System.out.print(i+1+"번째 시험성적입력: ");
				stu[a][i]=sc.nextInt();
			}
			System.out.println();
		}

		for(int a=0;a<stu.length;a++) {
			int sum=0;
			System.out.print(a+1+"번학생: [ ");
			for(int i=0;i<stu[a].length;i++) {
				System.out.print(stu[a][i]+"점 ");
				sum+=stu[a][i];
			}
			double avg=sum*1.0/stu[a].length;
			System.out.println("] 평균점수는 "+avg+"점입니다.");
			
		}
		
		
		
		
	}

}
