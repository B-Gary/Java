package four;
import java.util.Scanner;
public class c {
	
	//提示用户输入学生个数，学生姓名和他们的成绩，然后按照学生成绩降序排列;
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
	         System.out.println("请输入学生个数:");
	         int stuNum=input.nextInt();
	         c objArr[]=new c[stuNum];
	         for(int i=0;i<objArr.length;i++){
	            objArr[i]=new c();
	            System.out.println("请输入第"+(i+1)+"个学生的姓名");
	            String name=input.next();
	            objArr[i].setName(name);
	            System.out.println("请输入第"+(i+1)+"个学生的成绩");
	            long grade=input.nextLong();
	            objArr[i].setGrade(grade);
	         }
	         System.out.println("打印开始");
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
	             System.out.println(objArr[i].getName()+"的成绩是:"+objArr[i].getGrade());
	         }
	    }
}
