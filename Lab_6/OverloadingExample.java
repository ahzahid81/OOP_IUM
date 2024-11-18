package Lab_6;

public class OverloadingExample {
    public void display(int a){
        System.out.println("Method with one integer argument: " +a);
    }

    public void display(int a, int b){
        System.out.println("Method with two integer argument: " + a + "," + b);
    }

    public void display(double d){
        System.out.println("Method with one double argument: " +d);
    }

    public void display(int a, String s){
        System.out.println("Method with an integer and a String: " + a +", " +s);
    }

    public static void main(String [] args){
        OverloadingExample obj = new OverloadingExample();

        obj.display(5);
        obj.display(5, 10);
        obj.display(5.5);
        obj.display(5, "Abdul Hasib Zahid");

    }
}
