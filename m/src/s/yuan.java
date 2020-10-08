package s;
import java.util.Scanner;

public class yuan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x,y;
		double s;
		System.out.print("Enter a point with two coordinates:");
		x=input.nextDouble();
		y=input.nextDouble();
		s=Math.pow(x,2)+Math.pow(y,2);
		if(s<=100) {
			System.out.print("point ("+x+","+y+") is in the circle");
		}
		else {
			System.out.print("point ("+x+","+y+") is not in the circle");
		}
			
	}
}
