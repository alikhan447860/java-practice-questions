public class CountDigit {
    public static void main(String[] args) {
        int num = 12345;
        int count=0;
        int temp=num;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.out.println("The total number of digit in "+temp+" is "+count);
    }
}
