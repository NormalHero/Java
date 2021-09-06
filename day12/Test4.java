import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

class Book{
	String name;
	int price;
	String user;
	Book(String name,int price){
		this(name,price,"무명");
	}
	Book(String name,int price,String user){
		this.name=name;
		this.price=price;
		this.user=user;
	}
	@Override
	public String toString() {
		return "["+this.name+"] "+this.price+"원  판매자-"+this.user;
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
		data[0]=new Book("해리포터",5000,"홍길동");
		int index=1;

		while(index<3) {
			Scanner sc=new Scanner(System.in);
			System.out.print("책이름입력: ");
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
				System.out.println("이미 존재하는 도서입니다.");
				continue;
			}
			data[index++]=b;
			System.out.println("저장됨!");
		}

		for(Book v:data) {
			System.out.println(v);
		}











		/*
		Book[] data=new Book[3];
		data[0]=new Book("해리포터",5000,"홍길동");
		data[1]=new Book("해리포터",1000);
		data[2]=new Book("어린왕자",3000,"임꺽정");
		for(Book v:data) {
			System.out.println(v);
		}
		Book book=new Book("해리포터",2000,"아무무");
		int cnt=0;
		for(Book v:data) {
			if(book.equals(v)) {
				cnt++;
				System.out.println("같은책을 발견하였습니다!");
			}
		}
		System.out.println("같은책은 "+cnt+"권 존재합니다.");
		 */



	}

}
