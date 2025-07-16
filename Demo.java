public class Demo{
    public static void main(String[] args) {
      int arr[]={1,2,3,4,1,1,5};
      int start=0,maxlength=0,sum=0,k=5;
      for(int end=0;end<arr.length;end++){
             sum=sum+arr[end];
             while(sum>k){
                sum=sum-arr[start];
                start++;
             }
             maxlength=Math.max(maxlength,end-start+1);
      }
      System.out.println("Length of the longest subarray with sum less than or equal to " + k + " is: " + maxlength);
    }
}