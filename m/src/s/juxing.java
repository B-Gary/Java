package s;
import java.util.Scanner;

public class juxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x,y;
		System.out.print("Enter a point with two coordinates:");
		x=input.nextDouble();
		y=input.nextDouble();
		if (x<=5&&x>=-5&&y<=2.5&&y>=-2.5) {
			System.out.print("point ("+x+","+y+") is in the rectangle");
		}
		else {
			System.out.print("point ("+x+","+y+") is not in the rectangle");
		}
}

}
