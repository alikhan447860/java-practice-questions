public class ConcatTwostr {
    public static void main(String[] args) {
        char[]str1={'a','l','i'};
        char[]str2={' ','k','h','a','n'};
        char[]combo= new char[str1.length+str2.length];
        for(int i=0;i<str1.length;i++){
            combo[i]=str1[i];
        }
        for(int i=0;i<str2.length;i++){
            combo[str1.length+i]=str2[i];
        }
        for(char val:combo){
            System.out.print(val);
        }
    }
}
