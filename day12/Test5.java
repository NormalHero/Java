import java.util.Random;
import java.util.Scanner;

class Lotto{
	String name;
	int[] data=new int[5];
	Lotto(String name) {
		this.name=name;
		int index=0;
		while(index<5) {
			int num=new Random().nextInt(15)+1;
			boolean check=false;
			for(int i=0;i<index;i++) {
				if(num==this.data[i]) {
					check=true;
					break;
				}
			}
			if(check) {
				continue;
			}
			this.data[index++]=num;
		}
		System.out.println(this.name+"��, �ζǱ��ſϷ�!");
	}
	@Override
	public boolean equals(Object obj) {
		Lotto l=(Lotto)obj;
		int score=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(l.data[i]==this.data[j]) {
					score++;
					break;
				}
			}
		}
		if(score>=3) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String str="";
		System.out.print(this.name+"���� ��ȣ���[ ");

		for(int a=0;a<5;a++) {
			for(int i=0;i<4;i++) {
				if(this.data[i]>this.data[i+1]) {
					int tmp=this.data[i];
					this.data[i]=this.data[i+1];
					this.data[i+1]=tmp;
				}
			}
		}

		for(int v:this.data) {
			System.out.print(v+" ");
		}
		System.out.println("]");
		return str;
	}

}

public class Test5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("����� �����մϱ�?  ");
		int N=sc.nextInt();
		sc.nextLine();
		Lotto[] p=new Lotto[N];
		for(int i=0;i<N;i++) {
			System.out.print("�������̸��Է�: ");
			String name=sc.nextLine();
			p[i]=new Lotto(name);
		}
		Lotto l=new Lotto("��÷����");
		System.out.println(l);
		for(Lotto v:p) {
			System.out.println(v);
			if(v.equals(l)) {
				System.out.println(v.name+"�� ��÷!");
			}
		}
		
		
		


	}

}
/*
1. ����� �ζǸ� �����ұ��?
  5��
  ������ �̸��� �ۼ�
  ��ȣ�� ��������(1~15->�ߺ�xxx)

2. ����ζ�
  ��÷�ζ�
  [ _ _ _ _ _ ]

3. "��÷": 3���̻��� ���ڰ� ������ ��÷
   -> ��÷���� �̸��� ������ּ���!~~

4. 5���� �ζǻ��¸� ���
  ȫ�浿 [ _ _ _ _ _ ]�Դϴ�. << show()xxx
        (��������)
 */