import java.util.Iterator;
import java.util.LinkedList;

class C{
	int a;
	int b;
	C(){
		this.a=10;
		this.b=20;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+this.a+"/"+this.b+"]";
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		// 1. ���Ḯ��Ʈ �÷����� ����
		// 2. Ŭ���� C�� ��ü���� ����(������)
		// 3. ���ͷ����͸� Ȱ���Ͽ� �ֿܼ� ������ּ���!~~
		LinkedList<C> llist=new LinkedList();
		llist.add(new C());
		llist.add(new C());
		llist.add(new C());
		
		Iterator itr=llist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
