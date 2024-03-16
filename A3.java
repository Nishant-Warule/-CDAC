import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        System.out.println("Enter Two Number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double result;
        System.out.println("Enter the Operator");
        char c = sc.next().charAt(0);
        switch(c){
            case '+' :System.out.println(a+b);
            break;
            case '-' :System.out.println(a-b);
            break;
            case '*' :System.out.println(a*b);
            break;
            case '/' :System.out.println(a/b);
            break;
            case '%' :System.out.println(a%b);
            break;
            default :System.out.println("Enter Valid Operator");

        }
    }

    
}
