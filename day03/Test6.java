import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// [�ݺ���]

		// while  vs  for


		// while: �ݺ�Ƚ���� �Ҹ�Ȯ�Ҷ�, �����ϰ�, Ư�������� �����Ҷ����� ���

		// for: �ݺ�Ƚ���� �и��Ҷ�, N��, xȸ, ������ �־�������(1~10����)

		/*
		while(���ǽ�) { ���ǽ��� F�̸�, 16�����ο��� "�ٷ�" 19���������� �̵�
			���ǽ��� T���� {}��ϱ����� ����
		}
		 */

		/*
		int i=1;
		while(i<=3) {
			System.out.println("�ȳ��ϼ���!");
			i++;
		}
		System.out.println("i= "+i);
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		int sum=0;

		int i=1;
		while(i<=num) {
			if(i%2==1) {
				System.out.print(i+" ");
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.println("������ "+sum+"�Դϴ�.");




	}

}
