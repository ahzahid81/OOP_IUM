package Lab_4;

import java.util.Scanner;

public class EvenOddCollege {

    public static String College = "FCIS";

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
        System.out.println(College);
    }


}
