public class revanum {
    public static void main(String[] args) {
        int n= 12345;
        while(n!=0){
            int num=n%10;
            System.out.print(num);
            n=n/10;
        }
    }
}
