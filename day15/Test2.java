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
		
		// 1. 연결리스트 컬렉션을 생성
		// 2. 클래스 C의 객체들을 저장(여러개)
		// 3. 이터레이터를 활용하여 콘솔에 출력해주세요!~~
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
