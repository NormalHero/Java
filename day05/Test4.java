import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int[] stu=new int[5];
		for(int i=0;i<stu.length;i++) {
			do {
				System.out.print(i+1+"���л��� �����Է�: ");
				stu[i]=sc.nextInt();
			}while(stu[i]<0||100<stu[i]);
		}

		int sum=0;
		for(int v:stu) {
			sum+=v;
		}
		System.out.print("����= "+sum+"���̰�, ");
		double avg= sum*1.0/stu.length;		
		System.out.println("���= "+avg+"���Դϴ�.");

		System.out.println();
		for(int i=0;i<stu.length;i++) {
			if(avg<stu[i]) {
				System.out.println(i+1+"�� �л��� ��պ��� ���������� ȹ���߽��ϴ�!");
			}
		}
		


	}

}
