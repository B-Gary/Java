
import java.io.File;
import java.io.FileOutputStream;

/**
 * Java实现本地写文件
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
