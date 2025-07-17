import java.util.*;
public class Demo{
    public static void main(String[] args) {
        int arr[]={1,2,400,3,56,4};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
int maxlen=0;
for(int num:arr){
    if(!set.contains(num-1)){
        int current=num;
        int count=1;
        while(set.contains(current+1)){
            count++;
            current++;
        }
        maxlen=Math.max(maxlen,count);
    }
}    
System.out.println("The length of the longest consecutive sequence is : "+maxlen);
}
}