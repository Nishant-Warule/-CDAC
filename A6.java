import java.util.Scanner;
class BMI {
    public static void main(String[] args) {
        System.out.println("Enter your height in meter");
        Scanner sc =new Scanner(System.in);
        float a = sc.nextFloat();
        System.out.println("Enter your Weight in KG");
        float b = sc.nextFloat();
        float BMI ;
        BMI = b/(a*a);
        System.out.println("Your BMI is "+ BMI);
        if (18.4<BMI && BMI<25)
        {
            System.out.println("Healthy");
        }
        else if (BMI<18.5)
        {
            System.out.println("Underweight");
        }
        else
        {
        System.out.println("overweight");
        }
        }
}

    