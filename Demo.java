public class Demo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 5, 9, 11, 33 };
        int start = 0, end = arr.length - 1, tar = 2;
        int ans = -1; // default if not found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == tar) {
                ans = mid;        // store answer
                end = mid - 1;    // move left for first occurrence
            } else if (arr[mid] < tar) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Element found at index: " + ans);
    }
}
