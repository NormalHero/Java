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
			System.out.print("�׼��Է�: ");
			String act=sc.nextLine();
			if(act.equals("����")) {
				System.out.println("���α׷� ����...");
				break;
			}
			else if(act.equals("�������")) {
				System.out.println(s.pop()+" ������ҵ�");
			}
			else {
				s.push(new Action(act));
			}			
		}








	}

}
