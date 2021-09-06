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
		return this.title+" - "+this.time+"시";
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
		System.out.println(this.name+"님, 예매번호 ["+this.num+"]");
	}
}

public class Test6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Movie> al=new ArrayList();
		al.add(new Movie("소울"));
		al.add(new Movie("승리호"));
		Queue<Person> q=new LinkedList();
		while(true) {
			System.out.println();
			System.out.println("1.예매 2.입장 3.영화추가 4.영화삭제 5.종료");
			System.out.print("입력: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("예매자 성함입력: ");
				String name=sc.nextLine();
				System.out.println("===영화 목록===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				System.out.print("예매할 영화번호 선택: ");
				int num=sc.nextInt();
				q.offer(new Person(name,al.get(num-1)));
			}
			else if(act==2) {
				while(!q.isEmpty()) {
					Person p=q.poll();
					System.out.print(p.name+"님, 예매번호는? ");
					int num=sc.nextInt();
					if(num==p.num) {
						System.out.println("즐거운 관람되세요!~~");
					}
					else {
						System.out.println("다음에 다시 이용해주세요...");
					}
				}
			}
			else if(act==3) {
				System.out.println("===영화 목록===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				sc.nextLine();
				System.out.print("추가할 영화제목입력: ");
				String title=sc.nextLine();
				al.add(new Movie(title));
				System.out.println("영화추가완료!");
			}
			else if(act==4) {
				System.out.println("===영화 목록===");
				for(int i=0;i<al.size();i++) {
					System.out.println(i+1+". "+al.get(i));
				}
				System.out.print("삭제할 번호입력: ");
				int num=sc.nextInt();
				al.remove(num-1);
				System.out.println("영화삭제완료!");
			}
			else if(act==5) {
				break;
			}
			else {
				System.out.println("다시입력!");
			}
		}


	}

}
