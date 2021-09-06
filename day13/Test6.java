import java.util.ArrayList;
import java.util.Scanner;

interface useBook{
	boolean ON=true;
	boolean OFF=false;
	void bor();
	void ret();
}
class Book implements useBook{
	String title; // 책이름
	boolean check; // 대여상태
	Book(String title){
		this.title=title;
		this.check=ON;
		System.out.println("도서 생성완료!");
	}
	@Override
	public boolean equals(Object obj) {
		Book book=(Book)obj;
		if(book.title.equals(this.title)) { // ☆
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return this.title;
	}
	@Override
	public void bor() {
		if(this.check==OFF) {
			System.out.println("이미 대여중인 도서입니다..");
			return;
		}
		this.check=OFF;
		System.out.println("["+this.title+"]를(을) 대여하셨습니다.");
	}
	@Override
	public void ret() {
		this.check=ON;
		System.out.println("도서 반납완료!");
	}
}
public class Test6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Book> alist=new ArrayList();
		alist.add(new Book("어린왕자")); alist.add(new Book("해리포터"));
		
		while(true) {
			System.out.println();
			System.out.println("1.추가 2.삭제 3.대여 4.반납 5.종료");
			System.out.print("입력: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("추가하실 도서의 제목입력: ");
				String title=sc.nextLine();
				alist.add(new Book(title));
			}
			else if(act==2) {
				if(alist.isEmpty()) {
					System.out.println("삭제할 도서가 없습니다!");
					continue;
				}
				System.out.println("===도서 목록===");
				for(int i=0;i<alist.size();i++) {
					System.out.println(" "+(i+1)+". "+alist.get(i));
				}
				System.out.print("삭제할 번호: ");
				int num=sc.nextInt();
				alist.remove(num-1);
				System.out.println("도서 삭제완료!");
			}
			else if(act==3) {
				if(alist.isEmpty()) {
					System.out.println("대여할 도서가 없습니다!");
					continue;
				}
				System.out.println("===도서 목록===");
				for(int i=0;i<alist.size();i++) {
					System.out.println(" "+(i+1)+". "+alist.get(i));
				}
				System.out.print("대여할 번호: ");
				int num=sc.nextInt();
				alist.get(num-1).bor();
			}
			else if(act==4) {
				if(alist.isEmpty()) {
					System.out.println("반납할 도서가 없습니다!");
					continue;
				}
				sc.nextLine();
				System.out.print("반납하실 도서의 제목입력: ");
				String title=sc.nextLine();
				Book book=new Book(title);
				boolean check=true;
				for(int i=0;i<alist.size();i++) {
					if(alist.get(i).equals(book)) {
						alist.get(i).ret();
						check=false;
						break;
					}
				}
				if(check) {
					System.out.println("해당 도서는 없습니다!");
				}
			}
			else if(act==5) {
				break;
			}
			else {
				System.out.println("잘못된 입력입니다!");
			}
		}



	}

}
/*
책 추가
책 삭제
프로그램종료
책 대여 -> 대여된책을 또 대여할수xxx
책 반납 -> 책 객체를 돌려주면, 일치여부판단

forEach문을 통해 현재 alist상태출력
 */