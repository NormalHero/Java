
class Circle{
	String name; // �������,�Ӽ�,�ʵ� => ����xxx : �ν��Ͻ�����
	int radius;
	final double PI=3.14; // ���ȭ
	double area;
	Circle(String name){ // ������ �����ε�
		this(name,1);
	}
	Circle(String name,int radius){
		this.name=name;
		this.radius=radius;
		this.area=this.radius*this.radius*this.PI;
	}
	void show() {
		System.out.println(this.name+"�� ���̴� "+this.area+"�Դϴ�.");
	}
	void sizeUp() {
		this.radius++;
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+", �������!");
	}
	void sizeUp(int radius) {
		this.radius+=radius;
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+", �������!");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle c1=new Circle("����");
		Circle c2=new Circle("����",10);
		
		c1.show();
		c2.show();
		
		c1.sizeUp();
		c1.show();
		
		c1.sizeUp(8);
		c1.show();
		
	}

}
