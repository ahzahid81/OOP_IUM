package Project;
//443058333
// Abdul Hasib Zahid
class Student {
    protected String id;
    protected String name;
    protected String classRoom;
    protected String section;
    protected String busId;

    public Student(String id, String name, String classRoom, String section, String busId) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
        this.section = section;
        this.busId = busId;
    }

    public void studentDetails() {
        System.out.println("Student Details:");
        System.out.println("ID: " + id + ", Name: " + name + ", Class: " + classRoom + 
                           ", Section: " + section + ", Bus ID: " + busId);
    }
}