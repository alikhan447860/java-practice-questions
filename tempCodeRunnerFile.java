public class DecimaltoBinary {
    public static void main(String[] args) {
        int decimal = 10;  // Set the decimal number (you can change this)

        // Print the decimal number
        System.out.println("Decimal: " + decimal);

        while (decimal > 0) {
            System.out.print("Binary "+decimal % 2);  // Print remainder directly
            decimal = decimal / 2;  // Update the decimal by dividing by 2
        }
    }
}
