import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Poornesh\\Desktop\\fileone.txt");
		FileInputStream fis=null;
		try{fis=new FileInputStream(file);
		int input;
		while((input=fis.read())!=-1)
		{
			System.out.println((char)input);
		}
		

	}catch (IOException e) {
		e.printStackTrace();
	}
fis.close();
}}
