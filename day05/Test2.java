
public class Test2 {

	public static void main(String[] args) {
		// [�迭]
		// : �ڷᱸ��
		
		// �����͵��� �����Ͽ� ����, ����/����
		int[] stu=new int[3];
		// ����
		// 1. �ڷ��� ����(data type ��ġ)
		// 2. ���� ���õǾ��ִ� ������
		// 3. ������ ����/ũ��/����� ���� Ȯ��
		stu[0]=80; // �� [0]������ ����!!!!!
		stu[1]=60; // �ε���(index)
		stu[2]=90; // -> �ε��̹���� �̿��Ͽ� �����Ϳ� �����Ѵ�!
		
		//System.out.println(stu);

		int stu1=80;
		int stu2=60;
		int stu3=90;
		// N���л��� ������ __���Դϴ�.
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"���л��� ������ "+stu[i]+"���Դϴ�.");
		}


	}

}
