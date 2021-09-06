import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[] stu=new int[5];
		for(int i=0;i<stu.length;i++) {
			do {
				System.out.print(i+1+"번학생의 점수입력: ");
				stu[i]=sc.nextInt();
			}while(stu[i]<0||100<stu[i]);
		}

		int sum=0;
		for(int v:stu) {
			sum+=v;
		}
		System.out.print("총점= "+sum+"점이고, ");
		double avg= sum*1.0/stu.length;		
		System.out.println("평균= "+avg+"점입니다.");

		System.out.println();
		for(int i=0;i<stu.length;i++) {
			if(avg<stu[i]) {
				System.out.println(i+1+"번 학생은 평균보다 높은점수를 획득했습니다!");
			}
		}
		


	}

}
