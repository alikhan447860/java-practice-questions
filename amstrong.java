public class amstrong {
    public static void main(String[] args) {
        int n = 153;
        int n1 = n;
        int am = 0;
        int a;

        while (n != 0) {
            a = n % 10;  // Get the last digit
            am = am + a * a * a;  // Add the cube of the digit to am
            n = n / 10;  // Remove the last digit
        }

        if (n1 == am) {
            System.out.println("The number is an Armstrong number");
        } else {
            System.out.println("The number is not an Armstrong number");
        }
    }
}
