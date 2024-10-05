public class movezero{
    public static void main(String[] args) {
        int arr[]={0,2,0,45};
        int j=0;
        for(int i=0;i<arr.length;i++){
   if(arr[i]!=0){
    arr[j]=arr[i];
    j++;
   }
        }
    while (j<arr.length) {
        arr[j]=0;
        j++;
    }
    for(int val:arr){
        System.out.print(val+" ");
    }
    }
}