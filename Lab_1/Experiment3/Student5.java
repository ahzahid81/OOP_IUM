package Experiment3;

public class Student5 {

    int id;
    String name;
    int age;

    Student5(int id, String name){
        this.id = id;
        this.name = name;
        this.age = -1;
    }

    Student5(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display(){
        if(age!=-1)
            System.out.println("ID: "+id+", Name: "+name+", Age: "+age);
        else
            System.out.println("ID: "+id+", Name: "+name+", Age: Not Provided");
    }
}