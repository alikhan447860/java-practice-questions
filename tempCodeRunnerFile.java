public class Reversearr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
         int temp=arr[i];
         arr[start]=arr[end];
         arr[end]=temp;
         start++;
         end--;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
