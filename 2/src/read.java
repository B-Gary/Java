
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class read {

	/**
	 * Javaʵ�ֱ��ض��ļ�
	 */
	

	    public static void main(String[] args) throws Exception{

	        String path = "/hello.txt";
	        

	        FileInputStream fileInputStream = new FileInputStream(path);

	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

	        String line = null;

	        while ((line = bufferedReader.readLine()) != null) {
	            System.out.println(line);
	        }

	        fileInputStream.close();

	    
	}

}
