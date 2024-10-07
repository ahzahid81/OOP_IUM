package Lab_4;

public class AccMutator {
    int roll;
    String name;

    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public static void main(String[] args) {
        AccMutator student = new AccMutator();

        student.setName("Abdul Hasib Zahid");
        student.setRoll(100);

        System.out.println("Name: "+student.getName());
        System.out.println("Roll: "+student.getRoll());

        return;
    }
}

