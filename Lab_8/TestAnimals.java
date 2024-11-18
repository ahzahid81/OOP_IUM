package Lab_8;

public class TestAnimals {
    public static void main(String[] args) {
        Animal spider = new Spider();
        spider.walk();
        spider.eat();

        Pet cat = new Cat("Whiskers");
        cat.play();
        System.out.println("Cat's Name: " + cat.getName());
        cat.setName("Fluffy");
        System.out.println("Cat's new Name" + cat.getName());

        Pet fish = new Fish();
        fish.setName("Goldy");
        fish.play();
        System.out.println("Fish's name: " +fish.getName());
        ((Fish)fish).walk();
        ((Fish)fish).eat();
    }
}
