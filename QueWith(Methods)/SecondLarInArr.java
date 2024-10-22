public class SecondLarInArr {
    public static int findsecondlar(int[] array) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > largest) {
                second=largest;
                largest = value;
            } else if (value > second && value != largest) {
                second = value;
            }

        }
        return second;
    }

    public static void main(String[] args) {
        int array[] = { 23, 43, 13, 53, 22 };
        System.out.println("The second largest element in array is " + findsecondlar(array));
    }
}