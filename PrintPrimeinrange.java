public class PrintPrimeinrange {
    public static void main(String[] args) {
        int start = 10, end = 50;
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;  // Reset isPrime for each number
            // Check divisibility only up to the square root of i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;  // Break out of the loop if not prime
                }
            }
            // If the number is prime and greater than 1, print it
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
