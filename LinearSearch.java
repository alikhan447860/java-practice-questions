public class LinearSearch {
    public static void main(String[] args){
        int arr[]={23,43,145,53,64};
        int key=53;
        boolean found=false;
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("The element "+key+" found on the index "+i);
                found =true;
                break;
            }
        }
        if(!found){
        System.out.println("element not found");
        }
    }
}
