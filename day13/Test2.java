import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int[] arr=new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		for(int v:arr) {
			System.out.println(v);
		}
		
		
		
		/*
		int[] arr=new int[20];
		Scanner sc=new Scanner(System.in);
		
		int index=0;
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			
			arr[index++]=num;
						
		}
		
		int sum=0;
		System.out.print("[");
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]);
			sum+=arr[i];
			if(i!=index-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println("총합은 "+sum+"입니다.");
*/
	}

}
