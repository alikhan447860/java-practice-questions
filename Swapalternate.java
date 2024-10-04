public class Swapalternate {
    public static void main(String[] args) {
        int arr[]={23,22,34,36,77,89};
        for(int i=0;i<arr.length;i=i+2){
          if(i+1<arr.length){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;


          }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
