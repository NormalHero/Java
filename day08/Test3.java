
class Shape{
	void draw() {
		System.out.println("���� �׸���");
	}
}
class Circle extends Shape{
	void draw() { // �������̵�(������): �θ��� �޼��带 �̿��һ���������, ����� �ڽ�Ŭ������ �����ʴ°�쿡 ������
		System.out.println("�� �׸���");
	}
}

// �����ε� vs �������̵�
// 1) input,output�� ����,Ÿ���� �ٸ����
// 2) ��Ӱ��迡�� �߻�

public class Test3 {

	public static void main(String[] args) {
		
		
		Shape s=new Shape();
		s.draw();
		
		
		Circle c=new Circle();
		c.draw();
		
		
	}

}
