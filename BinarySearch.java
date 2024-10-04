public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=3;
        int start=0;
        int result=-1;
        int end=arr.length-1;
        while(start<=end){
           int mid=(start+end)/2;
           if(arr[mid]==target){
           result=target;
            break;
           }else if(arr[mid]<target){
               start=mid+1;
           }else{
            end=end-1;
           }
        }
        if(result==-1){
            System.out.println("element is not found in the array");
        }else{
            System.out.println("The element is found "+result);
        }
    }
}
