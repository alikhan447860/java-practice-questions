public class RotateArr{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;  // Number of positions to rotate
        int n = arr.length;

        k = k % n;  // Handle cases where k > length of array
        int[] result = new int[n];

        // Place last k elements in the beginning of the result array
        for (int i = 0; i < k; i++) {
            result[i] = arr[n - k + i];
        }

        // Place the remaining elements in result array
        for (int i = k; i < n; i++) {
            result[i] = arr[i - k];
        }

        // Copy the result array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
 
    
