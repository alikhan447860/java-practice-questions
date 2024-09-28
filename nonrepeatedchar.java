import java.util.*;
public class nonrepeatedchar {
    public static void main(String[] args) {
        String str="swiss";
        for(char c:str.toCharArray()){
            if(c==1){
                return;
            }
        }
        System.out.println();
    }
}
