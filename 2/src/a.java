import java.io.File;

public class a {
	/*
	 - File�Ĺ��캯��
	 - */
	 public static void main(String[] args) {
	     //File(String pathname)  ��ָ��·����ת����һ��File����
	     File file = new File("D:\\1.txt");
	     System.out.println(file);
	     //File(String parent,String child) ����ָ���ĸ�·�����ļ�·������File����
	     File file1 =  new File("D:\\a","1.txt");
	     System.out.println(file1);
	     //File(File parent,String child) ����ָ���ĸ�·��������ļ�·������File����
	     File parent = new File("D:\\a");
	     File file2 = new File(parent, "1.txt");
	     System.out.println(file2);
	     File file3 = new File(new File("D:\\a"),"1.txt");
	     System.out.println(file3);

	 }

}


