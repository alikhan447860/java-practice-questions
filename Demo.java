import java.util.*;
public class Demo{
    public static void main(String[] args) {
      int[] arr = { 5, 1, 4, 2, 8 };
     
     for(int i=0;i<arr.length-1;i++){
        int minindex=i;
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[j]<arr[minindex]){
              minindex=j;
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
     }

for(int val:arr){
    System.out.print(val+" ");
}
    }
}