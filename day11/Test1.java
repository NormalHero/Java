/*
�߻�Ŭ����
 : Ŭ�������� ����Ư���� ����, �θ�Ŭ����(����Ŭ����)�� �����ϰ� ��
   ��ü�� ����xxx
   �ؾƲ�� Ʋ
   �پ��� Ŭ������ �������ϴ� ����Ư������ ���س��� Ŭ����
*/
abstract class Shape{ // Ŭ�������� �����ϴ� Ŭ���� -> �߻�Ŭ����
	String name;
	Shape(String name){ // �ڽ�Ŭ�����鿡�� ������ �ֱ�����(��Ģ�� ����)
		this.name=name;
	}
	void func() {
		System.out.println("Ȯ��!");
	}
	abstract void draw();
	// ����,��,��Ʈ,...
	// 1) � Ŭ����������, "�����׸���"�׼��� ��������
	// 2) ����, ����Ŭ�������� "�������̵�"�� ��Ծ��ٸ�?
	//  => [������]: ����Ŭ�������� �ݵ�� draw()�� �������̵��ؾ߸��Ѵ�!
	//  -> "�߻�޼���"�� ������! : {}�� ����������==��������xxx
}
class Circle extends Shape{
	Circle(String name) {
		super(name);
	}
	void func() {
		System.out.println("�������̵�");
	}
	void draw() {
		System.out.println("���׸���");
	}
}
class Rect extends Shape{
	Rect(String name) {
		super(name);
	}
	void draw() {
		System.out.println("�׸�׸���");
	}
}
class Tri extends Shape{
	Tri(String name){
		super(name);
	}
	void draw() {
		System.out.println("����׸���");
	}
}

public class Test1 {

	public static void main(String[] args) {

		// Shape s=new Shape();xxx -> �߻�Ŭ������ ��ü�� �����Ҽ�����

		Circle c=new Circle("����");
		c.draw();
		c.func();
		
		Rect r=new Rect("å");
		r.func();

	}

}
