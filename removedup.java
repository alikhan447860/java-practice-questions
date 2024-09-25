public class removedup {
    public static void main(String[] args) {
        int arr[]={12,14,23,24,56,12};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            System.out.println("Duplicate elemt is "+arr[i]);
        }
    }
        }
    }
}
