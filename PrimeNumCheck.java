public class PrimeNumCheck {
    public static void main(String[] args) {
        int num=99;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isPrime=false;
                }
            }
        }
        if(isPrime){
            System.out.println("The num is prime");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
