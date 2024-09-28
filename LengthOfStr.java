public class LengthOfStr {
    public static void main(String[] args){
        String str="Alikhan";
        char []chararray=str.toCharArray();
        int length=0;
        for(int val:chararray){
            length++;
        }
        System.out.println(length);
    }
}
