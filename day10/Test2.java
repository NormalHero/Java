
class Shape{
	int point;
	int line;
	Shape(int point,int line){
		this.point=point;
		this.line=line;
	}
	void draw() {
		System.out.println("도형그리기");
	}
	void func() {
		System.out.println("부모클래스의 함수");
	}
}
class Circle extends Shape{
	int radius;
	double PI=3.14;
	double area;
	Circle(int point, int line) {
		super(point, line);
		// 자식클래스의 생성자에서는 부모클래스의 기본생성자를 제일먼저 호출함
		// 1) 부모클래스에 기본생성자를 작성
		// 2) 자식클래스의 생성자에서 부모클래스의 다른 생성자를 호출함 ←
	}
	void draw() { // 재정의==오버라이딩
		System.out.println("원그리기");
	}
	void f() {
		System.out.println("자식클래스의 함수");
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
