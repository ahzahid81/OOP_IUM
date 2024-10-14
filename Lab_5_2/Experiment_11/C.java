
// Child class tryting to inherit from both classes (Multiple Inheritence)
public class C extends A, B { //This will cause a compilation error in java
    public static void main (String [] args)
    {
        C obj = new C();
        obj.display();
    }
    
}
