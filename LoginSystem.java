public class LoginSystem {
    public static void main(String[] args)  {
        if(args.length<2){
            System.out.println("Please provide a valid username and password");
            return ;
        }
        String str=args[0];
        String str2=args[1];
        if(str.equals("admin")&&str2.equals("password")){
            System.out.println("User login sucssesfully");
        }else{
            System.out.println("incorrect user details ");
        }
    }
}
