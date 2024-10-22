import java.util.HashMap;

public class Frequencyofelement {
    public static void main(String[] args) {
        // Define two arrays with numbers
        int[] arr1 = {10, 57, 24, 10, 56, 2, 24};  
        int[] arr2 = {1, 1, 1, 1, 1};              

        // Call a method to print the frequencies of numbers in each array
        System.out.println("Frequencies in arr1:");
        printFrequencies(arr1);
        System.out.println("Frequencies in arr2:");
        printFrequencies(arr2);
    }

    private static void printFrequencies(int[] arr) {
        // Create a HashMap to store each number and its frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array
        for (int number : arr) {
            // Check if the number is already in the map
            if (frequencyMap.containsKey(number)) {
                // If yes, get the current count and increment it by 1
                int count = frequencyMap.get(number);
                frequencyMap.put(number, count + 1);
            } else {
                // If no, put the number in the map with a count of 1
                frequencyMap.put(number, 1);
            }
        }

        // Loop through the map to print each number and its frequency
        for (Integer key : frequencyMap.keySet()) {
            Integer frequency = frequencyMap.get(key);
            System.out.println(key + ": " + frequency);
        }
    }
}
