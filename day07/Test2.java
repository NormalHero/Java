/*
[ ��ü�����ڵ� ]
�⺻����: Ŭ���� --�ν��Ͻ�ȭ.��üȭ(new Ŭ������())--> ��ü.�ν��Ͻ�
  (�빮�ڷ� �����ϴ°��� �Ϲ���)
  
  ������: �ν��Ͻ�ȭ(��üȭ)�� ����ϴ� �Լ�.Ŭ�������� ��ü�� �����Ҷ� ����ϴ� �Լ�.Ŭ������ �̸��� ����
  		����Ÿ�� ���xxx
  ���ڰ����� ������ -> ����Ʈ������.�⺻������ => �ۼ������ʾƵ� �⺻������ ��������!
  				����, �ٸ� �����ڸ� 1���̻� �����ϸ� ���̻� �⺻���������ʴ´�!!

�ؾƲ:�ؾ = Ŭ����:��ü = 1:N
  �ڵ��� ���뼺 ����

1) �߻�ȭ
2) ĸ��ȭ: �ڵ� ���뼺 ���� / ������ �ı�ȿ�� ���� / ��������
3) ���: �ߺ��ڵ� �ּ�ȭ / ���ߺ������
4) ������: �Լ�(�޼���)���� �־�(��ü)�� ����ԵǾ� ��Ÿ���� ȿ��
*/
class Circle{
	String name; // ���
	int radius; // �������,�Ӽ�,�ʵ�
	double area;
	final double PI=3.14;
	void show() { // CircleŬ������ ��ü�鸸 �̿��Ҽ��ִ� ����Լ�(�޼���,�޼ҵ�)
		System.out.println(this.name+"�� �������� "+this.radius+"�Դϴ�.");
	}
	Circle(){
		System.out.println("�⺻������ ȣ���!");
	}
	Circle(String name,int radius){ // ������ �����ε�
		this.name=name;
		this.radius=radius;
		System.out.println("������ ȣ���!");
	}
	void getArea() {
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+"�� ���̴� "+this.area+"�Դϴ�.");
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(); // new Ŭ������()->������
		c1.name="����"; // .  ������ٿ�����
		c1.radius=10;
		
		Circle c2=new Circle("����",1);
		//c2.name="����";
		//c2.radius=1;
		
		
		c1.show();
		c2.show();
		
		c1.getArea();
		c2.getArea();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
