import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// [파일입출력]
public class Test4 {

	public static void main(String[] args) {

		File f=new File("C:\\Users\\admin\\Desktop\\JAVA2_방학특강\\test.txt");

		try {
			f.createNewFile();
			// 해당파일이 없을때에 생성해줌
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("파일생성 try문 처리완료");
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
			System.out.println("input스트림 try문 처리완료");
		}


		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA2_방학특강\\output.txt");
			fos.write(97); // 덮어쓰기
			
			fos.flush();
			fos.close();			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("output스트림 try문 처리완료");
		}
		
		
		
		/////////////////
		
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\Desktop\\JAVA2_방학특강\\photo.jpg");
			FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\JAVA2_방학특강\\photo - 복사본.jpg");
					
	
			
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
			System.out.println("사진복사-붙여넣기완료");
		}
		
		
		
		
		



	}

}
