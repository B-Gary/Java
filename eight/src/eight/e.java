package eight;

public class e {
	public static void main(String[] args){
	    QuadraticEquation q=new QuadraticEquation(2,1,5);
	    q.getRoot1();
	    q.getRoot2();
	}
}

class QuadraticEquation{
    private double a,b,c;//私有域a、b、c
    public QuadraticEquation(double a,double b,double c){//构造方法
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public void getRoot1(){
        double delt=getDiscriminant();
        if(delt<0){
            System.out.println("The equation has no roots.");
        }else if(delt==0){
            System.out.println((-b)/(2*a));
        }else{
            System.out.println((-b+Math.sqrt(delt))/(2*a));
        }
    }
    public void getRoot2(){
        double delt=getDiscriminant();
        if(delt<0){
            System.out.println("The equation has no roots.");
        }else if(delt==0){
            System.out.println((-b)/(2*a));
        }else{
            System.out.println((-b-Math.sqrt(delt))/(2*a));
        }
    }
    //a、b、c的三个get方法
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
}