import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter the operator");
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("enter two numbers");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                if(op == '+'){
                    ans=(n1+n2);
                }
                if(op == '-'){
                    ans=(n1-n2);
                }
                if(op == '*'){
                    ans=(n1*n2);
                }
                if(op == '/'){
                    ans=(n1/n2);
                }
                if(op == '%'){
                    ans=(n1 % n2);
                }
            }else if(op =='x' || op =='X'){
                break;
            }else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }

}
    
    
}
