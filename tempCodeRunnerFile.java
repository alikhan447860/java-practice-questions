public class amstrong{
    public static void main(String[] args){
    
    int n =153;
    int n1=n;
    int am=0;
    int a;
    while(n!=0){
    
    a=n%10; //153%10  3 15%10 = 5
    am=am*10+a; //27 152+1 
    n=n/10; // 15 1
    }
    if(n1==am){
    System.out.println("no is amstrong");
    
    }
    else {
    System.out.println("not a amstrong");
    }
    }
    }
    
    