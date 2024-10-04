public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={45,32,634,31,45};
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
