public class Missingelement {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int n=arr.length+1;
        int total=n*(n+1)/2;
        for(int num:arr){
            total=total-num;
        }
        System.out.println("The missing number is "+total);
    }
}
