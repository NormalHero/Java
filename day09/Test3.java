
class Ch{
	String name;
	int time;
	static int totalTime; // 값을 공유하는 멤버변수 -> 클래스변수
	void play(int time) {
		this.time+=time;
		this.totalTime+=time;
	}
	Ch(String name){
		this.name=name;
		this.time=0;
	}
	void show() {
		System.out.println(this.name+"님의 플레이시간: "+this.time+" / total: "+this.totalTime);
	}
}

class Dog{
	String name;
	static String[] act=new String[3];
	static int index;
	void play(String act) {
		this.act[this.index++]=act;
	}
	void show() {
		System.out.println(this.name+"이(가) 배운것은...");
		for(int i=0;i<this.index;i++) {
			System.out.print(this.act[i]+" ");
		}
		System.out.println("입니다!");
	}
	Dog(String name){
		this.name=name;
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Dog d1=new Dog("요요");
		Dog d2=new Dog("꼬미");
		d1.show();
		d2.show();
		
		d1.play("앉아!");
		d1.show();
		d2.show();
		
		d2.play("빵야!");
		d1.show();
		d2.show();
		
		/*
		Ch c1=new Ch("아무무");
		Ch c2=new Ch("아리");
		
		c1.show();
		c2.show();
		
		c1.play(10);
		c2.play(11);
		
		c1.show();
		c2.show();
		*/
	}

}
