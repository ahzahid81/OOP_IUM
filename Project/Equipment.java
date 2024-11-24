package Project;

//443058333
//Abdul Hasib Zahid

class Equipment {
    private String equipmentId;
    private String equipmentName;
    private String location;

    public Equipment(String equipmentId, String equipmentName, String location) {
        this.equipmentId = equipmentId;
        this.equipmentName = equipmentName;
        this.location = location;
    }

    public void equipmentDetails() {
        System.out.println("Equipment ID: " + equipmentId);
        System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Location: " + location);
    }

    public boolean isOperational() {
        return true; // Placeholder for demonstration
    }
}

