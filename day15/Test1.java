import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> alist=new ArrayList();
		System.out.print("�����Է�: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("�����Է�: ");
			int num=sc.nextInt();
			alist.add(num);
		}
		
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			System.out.print(alist.get(i)+" ");
		}
		System.out.println();
		
		for(int v:alist) {
			System.out.print(v+" ");
		}
		System.out.println();
		
		
		
		// [���ͷ����� / �ݺ���]
		//  : �÷��ǿ� ������ ������, �ַ� ���Ȯ�� �뵵�� Ȱ���
		Iterator itr=alist.iterator();
		// hasNext(): �����ִ� ��ü�� �����մϱ�?
		// next(): ����� ��ü ����(��ȯ)
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// itr == �÷����� ������ ��ü�̴�!
		// itr�� ���ؼ� ������ �÷��ǿ� ����� ������ ������ �ټ�������
		
		
		
		
		
		
		
		
	}

}
