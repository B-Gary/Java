package s;
import java.util.Scanner;

public class week {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int  h,q,m,j,k,y;
		// TODO Auto-generated method stub
		System.out.print("Enter year:(e.g.,2012): ");
		y=input.nextInt();
		System.out.print("Enter month:1-12: ");
		m=input.nextInt();
		System.out.print("Enter the day of month: 1-31:");
		q=input.nextInt();
		if(m<=2) {
			m=m+12;
			y=y-1;
		}
		j=Math.abs(y/100);
		k=y%100;
		h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		switch(h){
		case 0: System.out.println("Day of the week is Saturday"); break;
		case 1: System.out.println("Day of the week is Sunday"); break;
		case 2: System.out.println("Day of the week is Monday"); break;
		case 3: System.out.println("Day of the week is Tuesday"); break;
		case 4: System.out.println("Day of the week is Wednesday"); break;
		case 5: System.out.println("Day of the week is Thursday"); break;
		case 6: System.out.println("Day of the week is Friday");
		
		}
	}

}
