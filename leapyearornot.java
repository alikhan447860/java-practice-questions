public class leapyearornot {
    public static void main(String[] args) {
        int year=2025;
        if(year%4==0||year%400==0&&year%100!=0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
