public class PivotElement {
    public static void main(String[] args) {
        int arr[]={7,8,1,9,10};
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int mid=(start+end)/2;{
              if(arr[mid]>arr[0]){
                start=mid+1;
              }else{
                end=mid;
              }
            }
        }
        System.out.println("The pivot elemt in array is "+arr[start]);
    }
}
