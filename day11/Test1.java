/*
추상클래스
 : 클래스들의 공통특성을 묶어, 부모클래스(상위클래스)를 정의하게 됨
   객체를 생성xxx
   붕어빵틀의 틀
   다양한 클래스가 가져야하는 공통특성들을 명세해놓는 클래스
*/
abstract class Shape{ // 클래스들을 정의하는 클래스 -> 추상클래스
	String name;
	Shape(String name){ // 자식클래스들에게 영향을 주기위함(규칙을 만듦)
		this.name=name;
	}
	void func() {
		System.out.println("확인!");
	}
	abstract void draw();
	// 세모,별,하트,...
	// 1) 어떤 클래스에서도, "도형그리기"액션을 하진않음
	// 2) 만약, 하위클래스에서 "오버라이딩"을 까먹었다면?
	//  => [강제성]: 하위클래스들은 반드시 draw()를 오버라이딩해야만한다!
	//  -> "추상메서드"를 만들자! : {}를 가질수없음==내용정의xxx
}
class Circle extends Shape{
	Circle(String name) {
		super(name);
	}
	void func() {
		System.out.println("오버라이딩");
	}
	void draw() {
		System.out.println("원그리기");
	}
}
class Rect extends Shape{
	Rect(String name) {
		super(name);
	}
	void draw() {
		System.out.println("네모그리기");
	}
}
class Tri extends Shape{
	Tri(String name){
		super(name);
	}
	void draw() {
		System.out.println("세모그리기");
	}
}

public class Test1 {

	public static void main(String[] args) {

		// Shape s=new Shape();xxx -> 추상클래스는 객체를 생성할수없음

		Circle c=new Circle("도넛");
		c.draw();
		c.func();
		
		Rect r=new Rect("책");
		r.func();

	}

}
