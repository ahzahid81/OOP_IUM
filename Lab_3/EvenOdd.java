import java.util.Scanner;

public class EvenOdd {
    public static String evenChecker(int number){
        if(number%2==0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String result = evenChecker(n);

        System.out.println(result);
    }
}
