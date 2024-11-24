package Project;

//443058333
//Abdul Hasib Zahid

class Playground {
    private double area;
    private String classId;

    public Playground(double area, String classId) {
        this.area = area;
        this.classId = classId;
    }

    public boolean isOccupied() {
        return !classId.isEmpty(); // If classId is set, it means the playground is occupied
    }
}
