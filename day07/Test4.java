
class A{
	String title;
	int time;
	/*
	A(){
		this.title="미배정";
		this.time=0;
	}
	A(int time){
		this.title="과목미정";
		this.time=time;
	}
	A(String title){
		this.title=title;
		this.time=3;
	}
	*/
	A(){
		this("미배정",0); // this() -> 생성자
		System.out.println("기본생성자 호출됨!");
	}
	A(int time){
		this("과목미정",time); // this()를 가장먼저 작성해야함! -> "초기화"를 먼저해라!
		System.out.println("생성자1 호출됨!");
	}
	A(String title){
		this(title,3);
		System.out.println("생성자2 호출됨!");
	}
	A(String title,int time){
		this.title=title;
		this.time=time;
		System.out.println("생성자3 호출됨!");
	}
	void show() {
		System.out.println(this.title+": "+this.time+"시간");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		A a1=new A(4);
		a1.show();
		
		A a2=new A("현대문학의 이해");
		a2.show();
		
		A a3=new A("미술이론",2);
		a3.show();
		
		A a4=new A();
		a4.show();
		
		
		
	}

}
