public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={23,22,1,4,45,44,7};
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second&& arr[i]!=first){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("No second largest ele found");
        }else{
            System.out.println("The second largst element is "+second);
        }
    }
}
