
class Ch{
	String name;
	int time;
	static int totalTime; // ���� �����ϴ� ������� -> Ŭ��������
	void play(int time) {
		this.time+=time;
		this.totalTime+=time;
	}
	Ch(String name){
		this.name=name;
		this.time=0;
	}
	void show() {
		System.out.println(this.name+"���� �÷��̽ð�: "+this.time+" / total: "+this.totalTime);
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
		System.out.println(this.name+"��(��) ������...");
		for(int i=0;i<this.index;i++) {
			System.out.print(this.act[i]+" ");
		}
		System.out.println("�Դϴ�!");
	}
	Dog(String name){
		this.name=name;
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Dog d1=new Dog("���");
		Dog d2=new Dog("����");
		d1.show();
		d2.show();
		
		d1.play("�ɾ�!");
		d1.show();
		d2.show();
		
		d2.play("����!");
		d1.show();
		d2.show();
		
		/*
		Ch c1=new Ch("�ƹ���");
		Ch c2=new Ch("�Ƹ�");
		
		c1.show();
		c2.show();
		
		c1.play(10);
		c2.play(11);
		
		c1.show();
		c2.show();
		*/
	}

}
