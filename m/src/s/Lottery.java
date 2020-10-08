package s;
import java.util.Scanner;

public class Lottery {
	public static void main(String[] args) {
		int s,mo;
		int s1,s2,s3;
		int lottery1,lottery2,lottery3;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int lottery=(int)(Math.random()*900)+100;
		
		s= input.nextInt();
		s1=s/100;
		s2=s/10%10;
		s3=s%10;
		lottery1=lottery/100;
		lottery2=lottery/10%10;
		lottery3=lottery%10;
		System.out.println("The lottery number is "+lottery);
		if(s==lottery)
			System.out.println("Exact match:you win $10000");
		else if((s1==lottery1&&s2==lottery3&&s3==lottery2)||(s1==lottery2&&s2==lottery1&&s3==lottery3)||(s1==lottery2&&s2==lottery3&&s3==lottery1)||(s1==lottery3&&s2==lottery1&&s3==lottery2)||(s1==lottery3&&s2==lottery2&&s3==lottery1))
			System.out.println("Exact match:you win $3000");
		else if(s1==lottery1||s1==lottery2||s1==lottery3||s2==lottery1||s2==lottery2||s2==lottery3||s3==lottery1||s3==lottery2||s3==lottery3)
			System.out.println("Exact match:you win $1000");
		else
			System.out.println("Sorry,no match");
		
	}

}
