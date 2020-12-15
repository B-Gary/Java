import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		try {
			System.out.print("������һ������������");
            String str = input.next();
            System.out.println( str + " ת��Ϊʮ������ " + bin2Dex(str));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage() + "����һ����������");
		}
	}
	 public static int bin2Dex(String str) throws NumberFormatException
	    {
	        int result = 0;
	        for (int i = str.length() - 1; i >= 0; i--)
	        {
	            if (!(str.charAt(i) == '0' || str.charAt(i) == '1'))
	            {
	                throw new NumberFormatException(str);
	            }
	            else
	                result += Math.pow(2, (str.length() - i - 1)) * (str.charAt(i) - '0');
	        }

	        return result;
	    }
}
