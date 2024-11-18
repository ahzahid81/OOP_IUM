package Lab_6;

public class OverRidingExample {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        parent.showMessage();

        ChildClass child = new ChildClass();
        child.showMessage();

        ParentClass ref =  new ChildClass();
        ref.showMessage();        
    }
}
