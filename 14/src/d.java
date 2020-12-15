import java.util.Scanner;

public class d {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个二进制数：  ");
        String s = input.next();
        try{
            int d = binToDecimal(s);
            System.out.print(d);
        }catch (NumberFormatException starplatium){
            System.out.print(starplatium);
            System.exit(1);
        }
    }
    public static int binToDecimal (String hex)
    throws BinaryFormatException{
        int decimalValue = 0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            if(hexChar=='0'||hexChar=='1'){
                decimalValue=decimalValue*2+binCharToDecimal(hexChar);
            }
            else{
                throw new NumberFormatException("Not a binstring!");
            }
        }
        return decimalValue;
    }
    public static int binCharToDecimal(char ch){
        return ch-'0';
    }
}

class BinaryFormatException extends  NumberFormatException{
    public BinaryFormatException(String j){
        super(j);
    }
}
