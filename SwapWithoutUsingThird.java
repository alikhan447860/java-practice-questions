public class SwapWithoutUsingThird {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        a=a+b;//a is now 15
        b=a-b; // 15-5=10 b is now 10
        a=a-b;//15-10 =5 a is now 5
        System.out.println("value of  is "+a+" value of b is "+b);

    }
}
