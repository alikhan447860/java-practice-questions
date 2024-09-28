public class Pascaltri {
    public static void main(String[] args) {
        int rows = 5;  // Fixed number of rows

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for triangle shape
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;  // The first element is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
             
            }
            System.out.println();  // Move to the next row
        }
    }
}
