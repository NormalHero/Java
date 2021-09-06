/*
다중상속 지원xxx -> 모호성
상속관계는 유지가 어려움

[인터페이스]-> 다중상속 지원o
 : 클래스가 수행해야하는 메서드들을 정의
   "모듈화" 프로그래밍이 가능
*/
interface inter{ // 주로 클래스의 기능명세
	int i=10; // 인터페이스의 멤버변수는 모두 상수이며, 초기화를 반드시 해야함
	public static final int ii=100;
	// public: 클래스들 사이에서의 상호작용을 담당
	// static: 객체와 무관함
	// final: 상수화.값 변경 불가능
	void func();
	public abstract void func2();
	// public: 클래스들 사이에서의 상호작용을 담당
	// abstract: [강제성]을 부여->오버라이딩(재정의)를 해야만하게 만듦
	//            => "다형성" 실현가능
}
abstract class A{
	void f1() {
		System.out.println("안녕하세요!");
	}
	abstract void f2();
}
class C extends A implements inter {
	public void func() {
		// 상속관계에 있는 것들은 반드시 부모보다 자식의 공개범위가 더 넓어야함
		// 부모 <= 자식
	}
	public void func2() {
	}
	
	void f2() {
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		C c=new C();
		
		
	}

}
