
public class Test6 {

	static int add(int x,int y) {
		// ���� ����� �Լ����� �̸��� �����ϰ� �ۼ��غ���!
		// [�����ε�]
		// 1.������ ����,�ڷ���(data type)�� �޶����
		// 2.return�� �޶����
		return x+y;
	}
	static int add(int x,int y,int z) {
		return x+y+z;
	}
	static double add(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		int sum=add(a,b);
		System.out.println("sum�� "+sum+"�Դϴ�.");
		
		int c=30;
		sum=add(a,b,c);
		System.out.println("sum�� "+sum+"�Դϴ�.");
		
		double d=1.1,dd=1.2;
		double sum2=add(d,dd);
		System.out.println("sum2�� "+sum2+"�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		int num1=100,num2=200;
		int res=add(num1,num2);
		System.out.println("res�� "+res+"�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
