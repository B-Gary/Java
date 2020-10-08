package s;
import java.util.Scanner;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int p,s,t;
		String ch1=new String();
		String ch2=new String();
		String[] myList1= {"ACE","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] myList2= {"Clubs","Diamonds","Heart","Spades"};
		p=input.nextInt();
		s=p/13;
		t=p%13;
		ch1=myList1[p-1];
		ch2=myList2[t];
		System.out.print("The card you picked is "+ch1+" of "+ch2);
	}

}
