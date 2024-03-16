import java.util.Scanner;

class Grade{
    public static void main(String[] args){
        System.out.println("Enter the marks");
        Scanner sc = new Scanner(System.in);
        float a = sc .nextFloat();
        if (a>=90)
        {
             System.out.println("GRADE A"); 
        }
        else if (a>=70)
        {
            System.out.println("GRADE B");
        }
        else if (a>=50)
        {
            System.out.println("GRADE C");
        }
        else if (a>=40)
        {
            System.out.println("GRADE D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}