package s;
import java.util.Scanner;


public class ISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as interger:");
		s= input.nextInt();
		d1=s/100000000;
		d2=s/10000000%10;
		d3=s/1000000%10;
		d4=s/100000%10;
		d5=s/10000%10;
		d6=s/1000%10;
		d7=s/100%10;
		d8=s/10%10;
		d9=s%10;
		d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		if(d10==10)
			System.out.print("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+'x');
		else
			System.out.print("The ISBN-10 number is "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
		
	}

}
