import java.util.Random;

public class Test5 {

	public static void main(String[] args) {
		// "������"����
		
		int[] data=new int[10];
		
		Random rand=new Random();
		
		for(int i=0;i<data.length;i++) {
			data[i]=rand.nextInt(100)+1;
		}
		System.out.print("[ ");
		for(int v:data) {
			System.out.print(v+" ");
		}
		System.out.println("]");
		
		
		// [���� ū �� ã��]
		// : �˰���
		int max=data[0];
		int min=data[0];
		int minIndex=0;
		for(int i=1;i<data.length;i++) {
			//System.out.println("max= "+max);
			if(max<data[i]) {
				max=data[i];
			}
			if(min>data[i]) {
				min=data[i];
				minIndex=i;
			}
		}
		System.out.println("���� max= "+max);
		System.out.println("���� min= "+min);
		System.out.println("min�� ��ġ�� ["+minIndex+"]�Դϴ�.");
		
		
		
		
		
		
		/*
		for(int i=0;i<data.length;i++) {
			data[i]= rand.nextInt(6)+1; // 0~5.6������ ������ ����  -- +1 -->  1~6
		}
		for(int v:data) {
			System.out.print(v+" ");
		}
		 */
	}

}
