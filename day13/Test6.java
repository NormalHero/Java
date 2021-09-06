import java.util.ArrayList;
import java.util.Scanner;

interface useBook{
	boolean ON=true;
	boolean OFF=false;
	void bor();
	void ret();
}
class Book implements useBook{
	String title; // å�̸�
	boolean check; // �뿩����
	Book(String title){
		this.title=title;
		this.check=ON;
		System.out.println("���� �����Ϸ�!");
	}
	@Override
	public boolean equals(Object obj) {
		Book book=(Book)obj;
		if(book.title.equals(this.title)) { // ��
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
			System.out.println("�̹� �뿩���� �����Դϴ�..");
			return;
		}
		this.check=OFF;
		System.out.println("["+this.title+"]��(��) �뿩�ϼ̽��ϴ�.");
	}
	@Override
	public void ret() {
		this.check=ON;
		System.out.println("���� �ݳ��Ϸ�!");
	}
}
public class Test6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		ArrayList<Book> alist=new ArrayList();
		alist.add(new Book("�����")); alist.add(new Book("�ظ�����"));
		
		while(true) {
			System.out.println();
			System.out.println("1.�߰� 2.���� 3.�뿩 4.�ݳ� 5.����");
			System.out.print("�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				sc.nextLine();
				System.out.print("�߰��Ͻ� ������ �����Է�: ");
				String title=sc.nextLine();
				alist.add(new Book(title));
			}
			else if(act==2) {
				if(alist.isEmpty()) {
					System.out.println("������ ������ �����ϴ�!");
					continue;
				}
				System.out.println("===���� ���===");
				for(int i=0;i<alist.size();i++) {
					System.out.println(" "+(i+1)+". "+alist.get(i));
				}
				System.out.print("������ ��ȣ: ");
				int num=sc.nextInt();
				alist.remove(num-1);
				System.out.println("���� �����Ϸ�!");
			}
			else if(act==3) {
				if(alist.isEmpty()) {
					System.out.println("�뿩�� ������ �����ϴ�!");
					continue;
				}
				System.out.println("===���� ���===");
				for(int i=0;i<alist.size();i++) {
					System.out.println(" "+(i+1)+". "+alist.get(i));
				}
				System.out.print("�뿩�� ��ȣ: ");
				int num=sc.nextInt();
				alist.get(num-1).bor();
			}
			else if(act==4) {
				if(alist.isEmpty()) {
					System.out.println("�ݳ��� ������ �����ϴ�!");
					continue;
				}
				sc.nextLine();
				System.out.print("�ݳ��Ͻ� ������ �����Է�: ");
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
					System.out.println("�ش� ������ �����ϴ�!");
				}
			}
			else if(act==5) {
				break;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�!");
			}
		}



	}

}
/*
å �߰�
å ����
���α׷�����
å �뿩 -> �뿩��å�� �� �뿩�Ҽ�xxx
å �ݳ� -> å ��ü�� �����ָ�, ��ġ�����Ǵ�

forEach���� ���� ���� alist�������
 */