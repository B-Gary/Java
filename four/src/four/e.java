package four;

import java.util.*;
class e{
    public static void main(String[] args){
        //1.��ȡ�û������� ֻ������һ�����������ʱ���ݵĸ���(����ĳ���)
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a list:");
        int len=scanner.nextInt();//��ȡ�ĵ�һ����ֵ��������ĳ���
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        //2.���������������ж�
        if(isSorted(arr)){
            System.out.println("The list is already sorted.");
        }else{
            System.out.println("The list is not sorted.");
        }
    }
 
    public static boolean isSorted(int[] list){
        //��������������� ��ô�Ʊػ������һ������ �����С�����
        for(int i=1;i<list.length;i++){    
            if(list[i-1]>list[i]){    //�ӵڶ��ʼ,�ж����Ƿ�С������ǰһ��,���򷵻�false
                return false;
            }
        }
        return true;
    }
 
}