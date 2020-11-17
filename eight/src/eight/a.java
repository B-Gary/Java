package eight;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date date = new java.util.Date();
		int count = 0;
		for(long i = 10000; count < 8; count++,i*=10)
		{
			date.setTime(i);
			System.out.println(date.toString());
		}
	}

}
