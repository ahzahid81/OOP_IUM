package Lab_4;
import java.util.Scanner;

public class EvenOdd {
    public String college;

    EvenOdd(String college){
        this.college = college;
    }
    public static String evenChecker(int number)
    {
        if(number%2==0)
            return "even";
        else
            return "Odd";
    }
    public static void main (String [] args){
       EvenOdd obj = new EvenOdd("FCIS");
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       String result =  obj.evenChecker(n);


       System.out.println(result);
       System.out.println(obj.college);
    }
}
