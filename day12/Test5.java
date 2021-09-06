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
		System.out.println(this.name+"님, 로또구매완료!");
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
		System.out.print(this.name+"님의 번호목록[ ");

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
		System.out.print("몇명이 구매합니까?  ");
		int N=sc.nextInt();
		sc.nextLine();
		Lotto[] p=new Lotto[N];
		for(int i=0;i<N;i++) {
			System.out.print("구매자이름입력: ");
			String name=sc.nextLine();
			p[i]=new Lotto(name);
		}
		Lotto l=new Lotto("당첨복권");
		System.out.println(l);
		for(Lotto v:p) {
			System.out.println(v);
			if(v.equals(l)) {
				System.out.println(v.name+"님 당첨!");
			}
		}
		
		
		


	}

}
/*
1. 몇명이 로또를 구매할까요?
  5명
  구매자 이름을 작성
  번호는 랜덤지급(1~15->중복xxx)

2. 정답로또
  당첨로또
  [ _ _ _ _ _ ]

3. "당첨": 3개이상의 숫자가 같으면 당첨
   -> 당첨자의 이름을 출력해주세요!~~

4. 5명의 로또상태를 출력
  홍길동 [ _ _ _ _ _ ]입니다. << show()xxx
        (오름차순)
 */