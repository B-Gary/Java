package s;
import java.util.Scanner;

public class yuan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double x1,y1,x2,y2,r1,r2;
		double l,t;
		System.out.print("Enter circle1's center x-,y-coordiantes,and radius:");
		x1=input.nextDouble();
		y1=input.nextDouble();
		r1=input.nextDouble();
		System.out.print("Enter circle2's center x-,y-coordiantes,and radius:");
		x2=input.nextDouble();
		y2=input.nextDouble();
		r2=input.nextDouble();
		l=Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2);
		t=Math.abs(r1-r2);
		if(l<=Math.pow(t, 2)) {
			System.out.print("circle2 is inside circle1");
		}
		else if(l<=Math.pow(r1+r2, 2)) {
			System.out.print("cirile2 overlaps circle1");
		}
		else {
			System.out.print("cirile2 does not overlaps circle1");
		}
	}

}
