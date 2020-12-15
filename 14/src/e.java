import java.util.ArrayList;
import java.util.Scanner;

public class e {
    public static void main(String[] args)
    {
        ArrayList<Double> h = new ArrayList<Double>();
        double i = 114514;
        while(true){
            i++;
            try{
                h.add(i);
            }
            catch(OutOfMemoryError killerQueen){
                System.out.print("right!");
                System.exit(1);
            }
        }
    }
}
