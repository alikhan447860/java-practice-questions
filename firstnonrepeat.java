public class firstnonrepeat{
    public static char findFirstNonRepeat(String str) {
        int[] freq = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '_'; 
    }

    public static void main(String[] args) {
        String input = "swiss";
        String input2 = "caucau";
        String input3="atmospheric";

        char result = findFirstNonRepeat(input);
        char result2 = findFirstNonRepeat(input2);
        char result3=findFirstNonRepeat(input3);

        System.out.println("The first non-repeating character in \"" + input + "\" is: " + (result == '_' ? "_" : result));
        System.out.println("The first non-repeating character in \"" + input2 + "\" is: " + (result2 == '_' ? "_" : result2));
        System.err.println("The first non-repeating character in "+input3+" is: "+(result3=='_'?"_":result3));
    }
}
