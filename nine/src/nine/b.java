package nine;

import java.util.Arrays;
import java.util.Scanner;
public class b {
    public static void main(String args[]){
        //边读边删
        way1();
        //读完再删
        way2();
    }
//方法1
    public static void way1( ){
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] arr=new int[0];
        for(int i=0;i<10;i++){
            int number=scanner.nextInt();
            //如果数组中不包含这个数字就存到一个新的数组中：即容量+1，然后给扩容后的这个数组中最后一个元素赋值
            if(!isContains(arr,number)){
                arr=resize(arr,arr.length+1);//获得新数组
                arr[arr.length-1]=number;   //更新数组内的最后一个元素
            }
            //如果包含这个数字，角标i++直接跳过这个数字
        }
        System.out.println(Arrays.toString(arr));
    }
    //判断指定数组是否包含指定元素
    public static boolean isContains(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    //重置数组，相当于创建一个新数组
    public static int[] resize(int[] arr,int newLen){
        int[] newArr=new int[newLen];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
    //方法2
    public static void way2(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int size=arr.length;    //size为有效长度，以便于后期维护size
        for(int i=0;i<size;i++){
            //当前数字和后面的挨个比
            for(int j=i+1;j<size;j++){
                //如果有相等，就将重复数字的后面所有数字往前移动
                if(arr[i]==arr[j]){
                    for(int k=j+1;k<size;k++){
                        arr[k-1]=arr[k];
                    }
                    size--;//每次移动后重置有效长度
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
 
}