public class mergetwoarr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={7,8,9,10,11};
        int merarr[]= new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<arr2[j]){
                merarr[k]=arr1[i];
          i++;
            }else {
                merarr[k]=arr2[j];
                j++;
            }
            k++;
        }while (i<arr1.length) {
            merarr[k]=arr1[i];
            i++;
            k++;
        }while (j<arr2.length) {
        
            merarr[k]=arr2[j];
        j++;
        k++;
        }
for(int val:merarr){
    System.out.print(val+" ");
}
    }
}
