import java.util.Scanner;

class leapyear {
    public static void main(String[] args) 
{
    {
        System.out.println("Enter the year");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0)
        {
            System.out.println("LEAP YEAR");
        }
        else 
        {
            System.out.println("NOT A LEAP YEAR");
        }
    }
    
}
}
