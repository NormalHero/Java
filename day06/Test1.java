import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int[] arr= new int[10];

		Random rand=new Random();

		for(int i=0;i<arr.length;i++) {
			arr[i]=rand.nextInt(100)+1;
		}
		System.out.print("[ ");
		for(int v:arr) {
			//System.out.print(v+" ");
		}
		System.out.println("]");

		System.out.println();

		for(int a=0;a<arr.length;a++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int tmp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}

		System.out.print("[ ");
		for(int v:arr) {
			//System.out.print(v+" ");
		}
		System.out.println("]");

		Scanner sc=new Scanner(System.in);

		System.out.print("ã�������Է�: ");
		int num=sc.nextInt();

		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;

			if(arr[mid]==num) {
				System.out.println("ã�Ҵ�! ["+mid+"]�� �����մϴ�!");
				break;
			}
			else if(arr[mid]>num) {
				System.out.println("DOWN!");
				end=mid-1;
			}
			else {
				System.out.println("UP!");
				start=mid+1;
			}
		}
		if(start>end) {
			System.out.println(num+"��(��) ���������ʽ��ϴ�!");
		}











	}

}
