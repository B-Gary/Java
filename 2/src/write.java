
import java.io.File;
import java.io.FileOutputStream;

/**
 * Javaʵ�ֱ���д�ļ�
 */
public class write {

    public static void main(String[] args) throws Exception{

        String path = "/hello.txt";

        File file = new File(path);

        String content = "hello,shaonaiyi.\n";
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(content.getBytes());

        fileOutputStream.close();

    }

}
