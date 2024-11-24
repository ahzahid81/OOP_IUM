// Abdul Hasib Zahid
//ID: 443058333

package Project;

public class SchoolManagement {
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;

    public SchoolManagement(String schoolName, String address, String contactNumber, String mediumOfStudy) {
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.mediumOfStudy = mediumOfStudy;
    }

    public boolean isOpen() {
        // Assume the school is open for simplicity
        return true;
    }

    public void schoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Medium of Study: " + mediumOfStudy);
    }
}