public class CountVowelConso {
    public static void main(String[] args) {
        String str="automation";
        int vowels=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        System.out.println("Total number of vowels "+vowels);
        System.out.println("Total number of consonants "+consonant);
    }
}

