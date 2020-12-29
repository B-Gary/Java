import java.io.File;
import java.io.IOException;

public class b {
	public static void main(String[] args) throws IOException {
	    File file = new File("D:\\a\\1.txt");
	    File file1 = new File("1.txt");
	    boolean flag = file1.createNewFile();
	    System.out.println(flag);

	    File file2 = new File("b");
	    boolean flag2 = file2.mkdir();
	    System.out.println(flag);

	    File file3 = new File("c\\d\\e");
	    boolean d = file1.mkdir();
	    boolean c = file1.mkdirs();
	    System.out.println(d);
	    System.out.println(c);
	    File file4 = new File("c.txt");
	    System.out.println(file4.mkdir());

	    File file5 = new File("b");
	    System.out.println(file2.delete());
	}

}
