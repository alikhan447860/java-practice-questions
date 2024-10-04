public class uniqueele {
    public static void main(String[] args) {
        int arr[]={12,53,53,77,77};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
