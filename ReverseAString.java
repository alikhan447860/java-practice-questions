public class ReverseAString{
    public static void main(String[] args) {
        String str="ALI";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}