import java.util.*;
public class Demo{
    public static void main(String[] args) {
int arr[]={2,11,2,11,7,9};
int target=9;
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int val:arr){
        map.put(val,map.getOrDefault(val,0 )+1);
     }
     for(int key:map.keySet()){
        System.out.println("Element : "+key+" count : "+map.get(key));
     }
    }
}