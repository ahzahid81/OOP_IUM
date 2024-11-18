package PracticingStaticAndDynaicPolymorphism;

public class AggregationExample {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.drive();
    }
}
