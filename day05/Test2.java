
public class Test2 {

	public static void main(String[] args) {
		// [배열]
		// : 자료구조
		
		// 데이터들을 나열하여 저장, 관리/접근
		int[] stu=new int[3];
		// 조건
		// 1. 자료형 동일(data type 일치)
		// 2. 서로 관련되어있는 데이터
		// 3. 데이터 길이/크기/요소의 개수 확인
		stu[0]=80; // ★ [0]번부터 시작!!!!!
		stu[1]=60; // 인덱스(index)
		stu[2]=90; // -> 인덱싱방식을 이용하여 데이터에 접근한다!
		
		//System.out.println(stu);

		int stu1=80;
		int stu2=60;
		int stu3=90;
		// N번학생의 성적은 __점입니다.
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"번학생의 성적은 "+stu[i]+"점입니다.");
		}


	}

}
