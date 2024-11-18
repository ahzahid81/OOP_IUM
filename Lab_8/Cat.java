package Lab_8;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void play(){
        System.out.println(name + "is playing with a ball.");
    }

    @Override
    public void eat(){
        System.out.println(name +"is eating cat food.");
    }
    
}
