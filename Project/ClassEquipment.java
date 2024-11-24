package Project;

//Abdul Hasib Zahid
//443058333

class ClassEquipment extends Equipment {
    private String classroomName;
    private String usageFrequency;

    public ClassEquipment(String equipmentId, String equipmentName, String location, String classroomName, String usageFrequency) {
        super(equipmentId, equipmentName, location);
        this.classroomName = classroomName;
        this.usageFrequency = usageFrequency;
    }

    @Override
    public void equipmentDetails() {
        super.equipmentDetails();
        System.out.println("Classroom Name: " + classroomName);
        System.out.println("Usage Frequency: " + usageFrequency);
    }

    public String getClassroomName() {
        return classroomName;
    }

    public String getUsageFrequency() {
        return usageFrequency;
    }

    @Override
    public boolean isOperational() {
        // Custom logic for class equipment operational status
        return super.isOperational();
    }
}
