package four;

import java.util.*;
class e{
    public static void main(String[] args){
        //1.获取用户的输入 只不过第一个输入的数据时数据的个数(数组的长度)
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a list:");
        int len=scanner.nextInt();//获取的第一个数值就是数组的长度
        int[] arr=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        //2.对数组进行有序的判断
        if(isSorted(arr)){
            System.out.println("The list is already sorted.");
        }else{
            System.out.println("The list is not sorted.");
        }
    }
 
    public static boolean isSorted(int[] list){
        //如果不是升序排列 那么势必会出现有一组数据 左大右小的情况
        for(int i=1;i<list.length;i++){    
            if(list[i-1]>list[i]){    //从第二项开始,判断它是否小于它的前一项,是则返回false
                return false;
            }
        }
        return true;
    }
 
}