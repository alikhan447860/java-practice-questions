public class maxprofit{
    public static void main(String[] args) {
        int stock[]={7, 4, 1, 5, 6, 8};  
        int minprice=Integer.MAX_VALUE;
        int maxprof=0;
        for(int val:stock){
            if(val<minprice){
                minprice=val;

            }else{
                int profit=val-minprice;
if(profit>maxprof){
    maxprof=profit;
}
            }
        }
System.out.println("THe maximum profit in stock is "+maxprof);
    }
}