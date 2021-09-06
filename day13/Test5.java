import java.util.ArrayList;

class Student{
	String name;
	int score;
	Student(String name,int score){
		this.name=name;
		this.score=score;
	}
	void hello() {
		System.out.println("¾È³çÇÏ¼¼¿ä~!!");
	}
	@Override
	public String toString() {
		return this.name+" ÇÐ»ý";
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		
		ArrayList<Student> alist=new ArrayList();
		
		Student s1=new Student("ÀÓ²©Á¤",70);
		alist.add(s1);
		
		alist.add(new Student("È«±æµ¿",80));
		
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			alist.get(i).hello();
		}
		

	}

}
