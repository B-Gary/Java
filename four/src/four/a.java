package four;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list1=new int[101];
		int t;
		int i;
		System.out.print("Enter the integers between 1 and 100:");
		t=input.nextInt();
		while(t!=0) {
			list1[t]++;
			t=input.nextInt();
		}
		for(i=1;i<=100;i++) {
			if(list1[i]>1) {
				System.out.print(i+" occurs "+list1[i]+" times"+"\n");
			}
			else if(list1[i]>0) {
				System.out.print(i+" occurs "+list1[i]+" time"+"\n");
			}
		}
	}

}
