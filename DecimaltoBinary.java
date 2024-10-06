public class DecimaltoBinary {
    public static void main(String[] args) {
        int decimal = 10;  
        String binary="";
        System.out.println("Decimal: " + decimal);
         int rem=0;
        while (decimal > 0) {
            rem=decimal%2;
            binary=rem+binary;
            decimal = decimal / 2;  // Update the decimal by dividing by 2
        }
        System.out.println("Binary num is "+binary);
    }
}
