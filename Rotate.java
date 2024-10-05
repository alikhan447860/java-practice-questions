public class Rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=2;
     int n=arr.length;
     k=k%n;
     int result[]= new int[arr.length];
     for(int i=0;i<n;i++){
        result[(i+k)%n]=arr[i];
     }
     for(int j=0;j<n;j++){
        arr[j]=result[j];
     }
     for(int val:result){
        System.out.print(val+" ");
     }
    }
}
