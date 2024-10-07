package Lab_4;

public class A {
    void m(){
        System.out.println("hello, m!");
    }
    void n(){
        System.out.println("hello, n!");
        this.m();
    }
}
