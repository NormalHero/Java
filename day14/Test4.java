import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

class Action{
	String act;
	int num;
	Action(String act){
		this.act=act;
		this.num=new Random().nextInt(90)+10;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.act+" ["+this.num+"]";
	}

}
public class Test4 {

	public static void main(String[] args) {

		Stack<Action> s=new Stack();
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.print("액션입력: ");
			String act=sc.nextLine();
			if(act.equals("종료")) {
				System.out.println("프로그램 종료...");
				break;
			}
			else if(act.equals("실행취소")) {
				System.out.println(s.pop()+" 실행취소됨");
			}
			else {
				s.push(new Action(act));
			}			
		}








	}

}
