import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

class Movie{
	String title;
	int time;
	Movie(String title){
		this.title=title;
		this.time=new Random().nextInt(12)+1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title+" - "+this.time+"��";
	}
}
class Person{
	String name;
	int num;
	Movie movie;
	Person(String name,Movie movie){
		this.name=name;
		this.movie=movie;
		this.num=new Random().nextInt(90)+10;
		System.out.println(this.name+"��, ���Ź�ȣ ["+this.num+"]");
	}
}

public class Test6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Movie> al=new ArrayList();
		al.add(new Movie("�ҿ�"));
		al.add(new Movie("�¸�ȣ"));
		Queue<Person> q=new LinkedList();
		while(true) {
			System.out.println();
			System.out.println("1.���� 2.���� 3.��ȭ�߰� 4.��ȭ���� 5.����");
			System.out.print("�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("������ �����Է�: ");
				String name=sc.nextLine();
				System.out.println("===��ȭ ���===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				System.out.print("������ ��ȭ��ȣ ����: ");
				int num=sc.nextInt();
				q.offer(new Person(name,al.get(num-1)));
			}
			else if(act==2) {
				while(!q.isEmpty()) {
					Person p=q.poll();
					System.out.print(p.name+"��, ���Ź�ȣ��? ");
					int num=sc.nextInt();
					if(num==p.num) {
						System.out.println("��ſ� �����Ǽ���!~~");
					}
					else {
						System.out.println("������ �ٽ� �̿����ּ���...");
					}
				}
			}
			else if(act==3) {
				System.out.println("===��ȭ ���===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				sc.nextLine();
				System.out.print("�߰��� ��ȭ�����Է�: ");
				String title=sc.nextLine();
				al.add(new Movie(title));
				System.out.println("��ȭ�߰��Ϸ�!");
			}
			else if(act==4) {
				System.out.println("===��ȭ ���===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				System.out.print("������ ��ȣ�Է�: ");
				int num=sc.nextInt();
				al.remove(num-1);
				System.out.println("��ȭ�����Ϸ�!");
			}
			else if(act==5) {
				break;
			}
			else {
				System.out.println("�ٽ��Է�!");
			}
		}


	}

}
