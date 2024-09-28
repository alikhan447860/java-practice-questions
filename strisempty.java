public class strisempty {
    public static void main(String[] args) {
        String str="ali";
        char chararray[]=str.toCharArray();
        int length=0;
        for(int val:chararray){
            length++;
        }
        if(length==0){
            System.out.println("THis is empty string");
        }else{
            System.out.println("This is not a empty string");
        }
    }
}
