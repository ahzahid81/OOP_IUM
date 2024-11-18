package PracticingStaticAndDynaicPolymorphism;

public class Car {
    private Engine engine;

    // Agreegiation
    public Car (Engine engine){
        this.engine = engine;
    }
    
    //Compositio 
    public Car(){
        this.engine = new Engine();
    }
    public void drive(){
        System.out.println("Car is driving...");
        engine.start();
    }
}