public class Commonelein2arrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={4,5,6,7};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("The element is common in both arrays is "+arr1[i]);
                }
            }
        }
    }
}
