package s;
import java.util.Scanner;

public class lianggejuxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2,r1,r2,r3;
		double width1,height1,width2,height2;
		System.out.print("Enter r1's center x-, y-coordinates,width,and height:");
		x1=input.nextDouble();
		y1=input.nextDouble();
		width1=input.nextDouble();
		height1=input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates,width,and height:");
		x2=input.nextDouble();
		y2=input.nextDouble();
		width2=input.nextDouble();
		height2=input.nextDouble();
		r1=Math.pow(x1-x2,2)+Math.pow(y1-y2, 2);
		r2=Math.pow(height1/2-height2, 2);
		r3=Math.pow(height1+height2/2, 2);
		if(r1<=r2) {
			System.out.print("r2 is inside r1");
		}
		else if (r1>=r2&&r1<=r3) {
			System.out.print("r2 overlaps r1");
		}
		else {
			System.out.print("re does not overlap r1");
		}
	}

}
