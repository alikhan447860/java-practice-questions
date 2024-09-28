public class PerfectNum {
    public static void main(String[] args) {
        int n=28;
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
      if (n==sum) {
        System.out.println("yes this is perfect num "+n);
      }else{
        System.out.println("THis is not a perfect number");
      }

    }
}
