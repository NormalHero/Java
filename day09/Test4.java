import java.util.Scanner;

class Game{
	String name;
	static int total=100;
	Game(String name){
		this.name=name;
	}
	boolean play(int i) {
		this.total-=i;
		if(this.total<=0) {
			System.out.println("GameOver! ������� "+this.name+"�Դϴ�..");
			return true;
		}
		System.out.println("������: "+this.total);
		return false;
	}
}

public class Test4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("����� �÷��̾ �����ұ��?  ");
		int N=sc.nextInt();
		sc.nextLine();

		Game[] p=new Game[N];
		for(int i=0;i<N;i++) {
			String name;
			System.out.print(i+1+"��° �÷��̾��̸��Է�: ");
			name=sc.nextLine();
			p[i]=new Game(name);
		}

		while(true) {
			int i,num;
			String name;

			while(true) {
				System.out.print("���� �����ұ��?  ");
				name=sc.nextLine();
				num=0;
				boolean check=false;
				for(Game v:p) {
					num++;
					if(v.name.equals(name)) {
						check=true;
						break;
					}
				}
				if(check) {
					break;
				}
			}

			do {
				System.out.print("���� �����ּ���!  ");
				i=sc.nextInt();
			}while(i<=0 || 100<=i);
			sc.nextLine();
			boolean ans=p[num-1].play(i);
			if(ans) {
				break;
			}
		}

	}

}
