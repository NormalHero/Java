
public class Test4 {

	public static void main(String[] args) {
		
		// ���� ������  ++ --
		/*
		int a=0;
		++a; // ��������������.�켱���� ����
		a++; // ��������������.�켱���� �ſ� ����
		System.out.println("a= "+a);
		
		int b=a++;
		System.out.println("a= "+a+" , b= "+b);
		b=++a;
		System.out.println("a= "+a+" , b= "+b);
		*/
		// �ڵ����ǥ��
		
		
		
		int a,b,c,d;
		a=1;
		b=++a;
		c=a++;
		d=b++ + ++c;
		// ++c -> 3
		// b+c -> 5
		// d=5
		// b++ -> 3
		//System.out.println(a+" "+b+" "+c+" "+d);
		
		
		
		
		// �� ������  > < >= <= == !=(! NOT)
		// ���� -> true/false ����� ����������
		System.out.println("a>d = "+(a>d));
		System.out.println("a<d = "+(a<d));
		System.out.println("a>=b = "+(a>=b));
		System.out.println("a<=b = "+(a<=b));
		System.out.println("a==d = "+(a==d));
		System.out.println("a!=d = "+(a!=d));
		
		System.out.println();
		
		// �� ������
		// and: �׸���, ~~�̸鼭, ~~�̰�   &&
		// or: Ȥ��, �Ǵ�, ~~�̰ų�   ||
		// not: ����   !
		System.out.println("10<5 and 10>6 = "+((10<5)&&(10>6)));
		System.out.println("10<5 or 10>6 = "+((10<5)||(10>6)));
		System.out.println("not 10>5 = "+!(10>5));
		
		System.out.println();
		
		
		int x=10,y=20,z=30;
		System.out.println(x<y && x>z);
		System.out.println(x>y || x>z);
		System.out.println(!(x>y));
		
		
		
		
		
		
		
		
		
	}

}
