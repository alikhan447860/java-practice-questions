public class PerfectNum {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
          if(n%i==0){
            sum=sum+i;
          }
        }
        if(n==sum){
          System.out.println("Yes this is perfect number "+n);
        }else{
          System.out.println("This is not a perfect Number "+n);
        }
    }
}
