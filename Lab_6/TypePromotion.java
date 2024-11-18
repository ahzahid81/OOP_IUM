package Lab_6;


public class TypePromotion {
    public void m1(int i){
        System.out.println("Hello");
    }

    public void m1(float f){
        System.out.println("Java");
    }

    public static void main(String[] args) {
        TypePromotion t = new TypePromotion();
        t.m1(10);
        t.m1(10.5f);
        t.m1('a');
        t.m1(101);
    }
}
