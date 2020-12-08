package four;
import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list1=new int[11];
		int i,j;
		int sum=0;
		System.out.print("Enter ten numbers:");
		for(i=1;i<=10;i++) {
			list1[i]=input.nextInt();
		}
		for(i=1;i<=10;i++) {
			for(j=10;j>=i+1;j--) {
				if(list1[i]==list1[j]) {
					list1[j]=0;
				}
			}
		}
		System.out.print("");
		for(i=1;i<=10;i++) {
			if(list1[i]!=0) {
				sum++;
			}
		}
	}
}
