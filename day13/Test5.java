import java.util.ArrayList;

class Student{
	String name;
	int score;
	Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	void hello() {
		System.out.println("�ȳ��ϼ���~!!");
	}
	@Override
	public String toString() {
		return this.name+" �л�";
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		
		ArrayList<Student> alist=new ArrayList();
		
		Student s1=new Student("�Ӳ���",70);
		alist.add(s1);
		
		alist.add(new Student("ȫ�浿",80));
		
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			alist.get(i).hello();
		}
		

	}

}
