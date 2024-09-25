public class Largestainarr {
    public static void main(String[] args) {
        int arr[]={10,8,4,3,2,3,9};
        int larg=arr[0];
        for(int num:arr){
            if(num>larg){
                larg=num;
            }
        }
        System.out.println(larg);
    }
}
