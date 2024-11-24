package Project;

class Lab {
    private String labId;
    private String labName;
    private String equipmentList;
    private String inchargeName;

    public Lab(String labId, String labName, String equipmentList, String inchargeName) {
        this.labId = labId;
        this.labName = labName;
        this.equipmentList = equipmentList;
        this.inchargeName = inchargeName;
    }

    public void labDetails() {
        System.out.println("Lab ID: " + labId);
        System.out.println("Lab Name: " + labName);
        System.out.println("Equipment List: " + equipmentList);
        System.out.println("Incharge Name: " + inchargeName);
    }

    public boolean isAvailable() {
        return true; // Placeholder for demonstration
    }
}