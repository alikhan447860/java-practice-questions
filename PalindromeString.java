public class PalindromeString {
    public static void main(String[] args) {
        String str="racecar";
        boolean ispalindrom=true;
        for(int i=0;i<str.length()/2;i++){
            
              if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                ispalindrom=false;
                break;
              }
        }
        if (ispalindrom) {
            System.out.println("This is a palindrome string");
        }else{
            System.out.println("this is not a palindrome string");
        }
    }
}
