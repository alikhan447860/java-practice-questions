public class ReverseAInteger {
    public static void main(String[]args){
        int num=687;
  
       while(num>0){
        int last =num%10;
      
    System.out.print(last);
    num=num/10;
    }

    }
}
