import java.util.Random;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// [����_��������,��ǰ����]
		// : �˰���

		// -> "�˻�,Ž��"�� �����ϰ� �ϱ����ؼ�!

		int[] data=new int[5];
		Random rand=new Random();
		for(int i=0;i<data.length;i++) {
			data[i]=rand.nextInt(100)+1;
		}
		for(int v:data) {
			System.out.print(v+" ");	
		}
		System.out.println();

		// [����]
		for(int a=0;a<data.length;a++) {
			for(int i=0;i<data.length-1;i++) { // 2���� �����͸� ��� "��"�ϴ� ����
				if(data[i]>data[i+1]) {
					// [��ȯ]->"�ӽ����庯��"
					int tmp=data[i];
					data[i]=data[i+1];
					data[i+1]=tmp;
				}
			} // 1ȸ������ => �������� ������ŭ �ݺ�!
		}

		for(int v:data) {
			System.out.print(v+" ");	
		}


		// [Ž��,�˻�]
		// ����Ž��,�̺а˻�
		// => ����: "����"�� �Ǿ��ִ°�?

		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("�˻��� �������Է�: ");
		int num=sc.nextInt();

		int start=0;
		int end=data.length-1; // 1. start/end ���� ����
		while(true) {
			int mid=(start+end)/2; // 2. mid���� ����

			if(data[mid]==num) { // <-- ���� ã�����°��� ��ġ?
				System.out.print("ã�Ҵ�! ");
				System.out.println("["+mid+"]");
				break;
			}
			else if(data[mid]<num) {
				System.out.println("ũ��.");
				start=mid+1;
			}
			else {
				System.out.println("�۴�.");
				end=mid-1;
			}
		}








	}

}
