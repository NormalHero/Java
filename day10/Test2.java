
class Shape{
	int point;
	int line;
	Shape(int point,int line){
		this.point=point;
		this.line=line;
	}
	void draw() {
		System.out.println("�����׸���");
	}
	void func() {
		System.out.println("�θ�Ŭ������ �Լ�");
	}
}
class Circle extends Shape{
	int radius;
	double PI=3.14;
	double area;
	Circle(int point, int line) {
		super(point, line);
		// �ڽ�Ŭ������ �����ڿ����� �θ�Ŭ������ �⺻�����ڸ� ���ϸ��� ȣ����
		// 1) �θ�Ŭ������ �⺻�����ڸ� �ۼ�
		// 2) �ڽ�Ŭ������ �����ڿ��� �θ�Ŭ������ �ٸ� �����ڸ� ȣ���� ��
	}
	void draw() { // ������==�������̵�
		System.out.println("���׸���");
	}
	void f() {
		System.out.println("�ڽ�Ŭ������ �Լ�");
	}
}

public class Test2 {

	public static void main(String[] args) {

		Shape s=new Shape(4,4);
		s.draw();
		s.func();

		Circle c=new Circle(100,1);
		c.draw();
		c.func();
		c.f();


	}

}
