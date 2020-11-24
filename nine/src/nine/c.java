package nine;

import java.util.Scanner;
import java.util.ArrayList;
import javafx.geometry.Point2D;

public class c
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int number = input.nextInt();

        ArrayList<Point2D> points = enterPoints(number);
        double area = getArea(points);  
        System.out.println(area);
    }

    public static ArrayList<Point2D> enterPoints(int number)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Point2D> points = new ArrayList<>();
        System.out.print("Enter the coordinates of points: ");
        for (int i = 0; i < number; i++)
        {
            points.add(new Point2D((input.nextDouble()), (input.nextDouble())));
        }

        return points;
    }

    public static double getArea(ArrayList<Point2D> points)
    {
        double area = 0.0;
        for (int i = 1; i < points.size() - 1; i++)
        {
            area += everyTriangle(points.get(0), points.get(i), points.get(i + 1));
        }
        return area;
    }

    public static double everyTriangle(Point2D p1, Point2D p2, Point2D p3)
    {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
        double s = (s1 + s2 + s3) / 2;
        //System.out.println(s1 + " " + s2 + " " + s3 + " " + s);
        double triangleArea = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        //System.out.println(triangleArea);
        return triangleArea;
    }
}
