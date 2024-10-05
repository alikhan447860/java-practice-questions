public class Selection{
    public static void main(String[] args) {
        int arr[]={23,11,4,6,0};
        for(int i=0;i<arr.length;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
