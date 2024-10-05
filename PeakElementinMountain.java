public class PeakElementinMountain {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,0};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        System.out.println("The peak element in array is "+arr[start]);

    }
}
