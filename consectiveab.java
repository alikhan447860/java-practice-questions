public class consectiveab {
    public static void main(String[] args) {
        String str="abababababab";
        int count=0;
        int index=0;
        while(index<str.length()-1){
            if(str.substring(index,index+2).equals("ab")){
                count++;
                index=index+2;
            }else{
                index++;
            }
        }
        System.out.println("Consecutive total ab is "+count);
    }
}
