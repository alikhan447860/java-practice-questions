import java.util.*;
public class RandomNum {
    public static void main(String[] args) {
        Random r=new Random();
        for(int i=0;i<5;i++){
            System.out.print(r.nextInt(100)+" ");
        }
    }
}
