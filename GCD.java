public class GCD{
    public static void main(String[] args) {
        int a=40,b=60,g=0;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                g=i;
            }
        }
        System.out.println("The gcd of a and b is "+g);
    }
}
