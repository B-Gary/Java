package nine;

import java.util.Arrays;
import java.util.Scanner;
public class b {
    public static void main(String args[]){
        //�߶���ɾ
        way1();
        //������ɾ
        way2();
    }
//����1
    public static void way1( ){
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] arr=new int[0];
        for(int i=0;i<10;i++){
            int number=scanner.nextInt();
            //��������в�����������־ʹ浽һ���µ������У�������+1��Ȼ������ݺ��������������һ��Ԫ�ظ�ֵ
            if(!isContains(arr,number)){
                arr=resize(arr,arr.length+1);//���������
                arr[arr.length-1]=number;   //���������ڵ����һ��Ԫ��
            }
            //�������������֣��Ǳ�i++ֱ�������������
        }
        System.out.println(Arrays.toString(arr));
    }
    //�ж�ָ�������Ƿ����ָ��Ԫ��
    public static boolean isContains(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    //�������飬�൱�ڴ���һ��������
    public static int[] resize(int[] arr,int newLen){
        int[] newArr=new int[newLen];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
    //����2
    public static void way2(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter ten numbers:");
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int size=arr.length;    //sizeΪ��Ч���ȣ��Ա��ں���ά��size
        for(int i=0;i<size;i++){
            //��ǰ���ֺͺ���İ�����
            for(int j=i+1;j<size;j++){
                //�������ȣ��ͽ��ظ����ֵĺ�������������ǰ�ƶ�
                if(arr[i]==arr[j]){
                    for(int k=j+1;k<size;k++){
                        arr[k-1]=arr[k];
                    }
                    size--;//ÿ���ƶ���������Ч����
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
 
}