package Project;

//Abdul Hasib Zahid
//443058333

class LabEquipment extends Equipment {
    private String labName;
    private String maintenanceSchedule;

    public LabEquipment(String equipmentId, String equipmentName, String location, String labName, String maintenanceSchedule) {
        super(equipmentId, equipmentName, location);
        this.labName = labName;
        this.maintenanceSchedule = maintenanceSchedule;
    }

    @Override
    public void equipmentDetails() {
        super.equipmentDetails();
        System.out.println("Lab Name: " + labName);
        System.out.println("Maintenance Schedule: " + maintenanceSchedule);
    }

    public String getLabName() {
        return labName;
    }

    public String getMaintenanceSchedule() {
        return maintenanceSchedule;
    }

    @Override
    public boolean isOperational() {
        // Custom logic for lab equipment operational status
        return super.isOperational();
    }
}
