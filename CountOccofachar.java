public class CountOccofachar {
    public static void main(String[] args) {
        String str="automation";
        char c='a';
        int count =0;
        char chararr[]=str.toCharArray();
        for(char ch:chararr){
            if(c==ch){
                count++;
            }
        }
        System.out.println("The occ of char a is "+count);
        // String str="automation";
        // char ch='a';
        // int count=0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)==ch){
        //     count++;
        //     }
        // }
        // System.out.println("The occ of char a is "+count);
    }
}
