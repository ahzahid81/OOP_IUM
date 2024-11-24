package Project;

//443058333
//Abdul Hasib Zahid

public class Main {
    public static void main(String[] args) {
        // School Details
        System.out.println("=== School Details ===");
        SchoolManagement school = new SchoolManagement("Al Noor School", "Madina", "1234567890", "English");
        school.schoolDetails();

        // Classroom Example
        System.out.println("\n=== Classroom Example ===");
        Classroom class1 = new Classroom("C1", "Grade 5", "T001", 25, "E001");
        class1.classDetails();

        // Student Example
        System.out.println("\n=== Student Example ===");
        PrimaryStudent student1 = new PrimaryStudent("S001", "Ayesha Ahmed", "C1", "A", "B001");
        student1.studentDetails();
        student1.payFees(5000);  // Paying part of the fees
        student1.payFees(3000);  // Overpayment scenario
        student1.displayFeeStatus();

        // Department Example
        System.out.println("\n=== Department Example ===");
        String[] memberList = {"T001", "T002", "T003"};
        Department department = new Department("D001", "Science", "Dr. Kareem", memberList);
        department.departmentDetails();
        department.addMember("T004"); // Adding a new member
        department.removeMember("T002"); // Removing a member
        department.departmentDetails(); // Display updated members

        // Lab Example
        System.out.println("\n=== Lab Example ===");
        Lab lab1 = new Lab("L001", "Physics Lab", "Microscope, Voltmeter", "Dr. Salim");
        lab1.labDetails();
        System.out.println("Is Lab Available? " + lab1.isAvailable());
       
        // Notice Board Example
        System.out.println("\n=== Notice Board Example ===");
        String[] initialNotices = {"Exam on Monday", "Holiday on Friday"};
        NoticeBoard noticeBoard = new NoticeBoard("NB001", initialNotices);
        noticeBoard.displayNotices();
        noticeBoard.addNotice("Sports Day on Wednesday");
        System.out.println("\nUpdated Notices:");
        noticeBoard.displayNotices();

        // Bus Example
        System.out.println("\n=== Bus Example ===");
        Bus bus1 = new Bus("B001", "Mr. Ahmed", "Route A", 50);
        bus1.busDetails();
       
        // Equipment Example
        System.out.println("\n=== Equipment Example ===");
        Equipment equipment1 = new Equipment("E001", "Projector", "Classroom C1");
        equipment1.equipmentDetails();
        System.out.println("Is Equipment Operational? " + equipment1.isOperational());
       
    }
}
