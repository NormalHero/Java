// [���]
class Person{
	protected String name; // protected: ����Ŭ����+�ڽ�Ŭ���������� ���ٰ���
	String getName() {
		return this.name;
	}
	void hello() {
		System.out.println("�ȳ��ϼ���!");
	}
//	Person(){
//		System.out.println("�θ�Ŭ������ �⺻������ ȣ���!");
//	}
	Person(String name){
		this.name=name;
		//System.out.println("�θ�Ŭ������ ������ ȣ���!");
	}
}

class Student extends Person{
	int score;
	void hello() {
		System.out.println("��������");
	}
	void study() {
		System.out.println(this.getName()+"�л��� ������.......");
	}
	Student(){
		this("����",0);
	}
	Student(String name){
		this(name,0);
	}
	Student(String name,int score){
		super(name);
		this.score=score;
	}
	void show() {
		System.out.println(this.name+"�л��� ������ "+this.score+"���Դϴ�.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Student s0=new Student();
		Student s1=new Student("ȫ�浿");
		Student s2=new Student("�Ӳ���",50);
		
		s0.hello();
		
		s0.show();
		s1.show();
		s2.show();
		
		
	}

}
