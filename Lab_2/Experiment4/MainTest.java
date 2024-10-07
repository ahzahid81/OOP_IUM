package Lab_2.Experiment4;

public class MainTest {
    public static void main(String[] args) {
        Student7 s1 = new Student7(100, "Zahid");
        Student7 s2 = new Student7();


        s2.id = s1.id;
        s2.name = s1.name;

        s1.display();
        s2.display();
    }
}
