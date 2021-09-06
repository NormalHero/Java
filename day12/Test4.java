import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class Book{
	String name;
	int price;
	String user;
	Book(String name,int price){
		this(name,price,"����");
	}
	Book(String name,int price,String user){
		this.name=name;
		this.price=price;
		this.user=user;
	}
	@Override
	public String toString() {
		return "["+this.name+"] "+this.price+"��  �Ǹ���-"+this.user;
	}
	@Override
	public boolean equals(Object obj) {
		Book b=(Book)obj;
		if(b.name.equals(this.name)) {
			return true;
		}
		return false;
	}

}
public class Test4 {

	public static void main(String[] args) {

		Book[] data=new Book[3];
		data[0]=new Book("�ظ�����",5000,"ȫ�浿");
		int index=1;

		while(index<3) {
			Scanner sc=new Scanner(System.in);
			System.out.print("å�̸��Է�: ");
			String name=sc.nextLine();
			Book b=new Book(name,0);
			boolean check=false;
			for(int i=0;i<index;i++) {
				if(b.equals(data[i])) {
					check=true;
					break;
				}
			}
			if(check){
				System.out.println("�̹� �����ϴ� �����Դϴ�.");
				continue;
			}
			data[index++]=b;
			System.out.println("�����!");
		}

		for(Book v:data) {
			System.out.println(v);
		}











		/*
		Book[] data=new Book[3];
		data[0]=new Book("�ظ�����",5000,"ȫ�浿");
		data[1]=new Book("�ظ�����",1000);
		data[2]=new Book("�����",3000,"�Ӳ���");
		for(Book v:data) {
			System.out.println(v);
		}
		Book book=new Book("�ظ�����",2000,"�ƹ���");
		int cnt=0;
		for(Book v:data) {
			if(book.equals(v)) {
				cnt++;
				System.out.println("����å�� �߰��Ͽ����ϴ�!");
			}
		}
		System.out.println("����å�� "+cnt+"�� �����մϴ�.");
		 */



	}

}
