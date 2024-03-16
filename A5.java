import java.util.Scanner;
class alphabet {
    public static void main(String[] args) {
        System.out.println("Enter the alphabet");
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }

        
    }

    
}
