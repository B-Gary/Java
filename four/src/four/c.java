package four;
import java.util.Scanner;
public class c {
	
	//��ʾ�û�����ѧ��������ѧ�����������ǵĳɼ���Ȼ����ѧ���ɼ���������;
	    private String name;
	    private long grade;
	    public long getGrade(){
	        return grade;
	    }
	    public void setGrade(long grade){
	        this.grade=grade;
	    }
	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	        this.name=name;
	    }
	    public String toString(){
	        return this.name;
	    }
	     public static void main(String[] args) {
	         Scanner input=new Scanner(System.in);
	         System.out.println("������ѧ������:");
	         int stuNum=input.nextInt();
	         c objArr[]=new c[stuNum];
	         for(int i=0;i<objArr.length;i++){
	            objArr[i]=new c();
	            System.out.println("�������"+(i+1)+"��ѧ��������");
	            String name=input.next();
	            objArr[i].setName(name);
	            System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
	            long grade=input.nextLong();
	            objArr[i].setGrade(grade);
	         }
	         System.out.println("��ӡ��ʼ");
	         for(int i=0;i<objArr.length;i++){
	             for(int j=i+1;j<objArr.length;j++){
	                 if(objArr[i].getGrade()<objArr[j].getGrade()){
	                c s=new c();
	                s=objArr[i];
	                objArr[i]=objArr[j];
	                objArr[j]=s;
	                 }
	             }
	         }
	         for(int i=0;i<objArr.length;i++){
	             System.out.println(objArr[i].getName()+"�ĳɼ���:"+objArr[i].getGrade());
	         }
	    }
}
