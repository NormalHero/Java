import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// [���������]
public class Test4 {

	public static void main(String[] args) {

		File f=new File("C:\\Users\\admin\\Desktop\\JAVA2_����Ư��\\test.txt");

		try {
			f.createNewFile();
			// �ش������� �������� ��������
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("���ϻ��� try�� ó���Ϸ�");
		}




		try {
			FileInputStream fis=new FileInputStream(f);

			int data;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("input��Ʈ�� try�� ó���Ϸ�");
		}


		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA2_����Ư��\\output.txt");
			fos.write(97); // �����
			
			fos.flush();
			fos.close();			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("output��Ʈ�� try�� ó���Ϸ�");
		}
		
		
		
		/////////////////
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\JAVA2_����Ư��\\photo.jpg");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA2_����Ư��\\photo - ���纻.jpg");
					
	
			
			byte[] b=new byte[1000];
			int data;
			while((data=fis.read(b))!=-1) {
				
				fos.write(b, 0, data);
				
			}
			fos.flush();
			fos.close();
			
			fis.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("��������-�ٿ��ֱ�Ϸ�");
		}
		
		
		
		
		



	}

}
