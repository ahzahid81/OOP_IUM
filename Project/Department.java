package Project;
//443058333
//Abdul Hasib Zahid
import java.util.ArrayList;
import java.util.Arrays;

class Department {
    private String departmentId;
    private String departmentName;
    private String headOfDepartment;
    private ArrayList<String> memberList;

    public Department(String departmentId, String departmentName, String headOfDepartment, String[] members) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.headOfDepartment = headOfDepartment;
        this.memberList = new ArrayList<>(Arrays.asList(members));
    }

    public void departmentDetails() {
        System.out.println("Department ID: " + departmentId);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Head of Department: " + headOfDepartment);
        System.out.println("Members:");
        for (String member : memberList) {
            System.out.println("- " + member);
        }
    }

    public void addMember(String memberId) {
        if (memberList.contains(memberId)) {
            System.out.println("Error: Member " + memberId + " already exists.");
            return;
        }
        memberList.add(memberId);
        System.out.println("Added member: " + memberId);
    }

    public void removeMember(String memberId) {
        if (memberList.remove(memberId)) {
            System.out.println("Removed member: " + memberId);
        } else {
            System.out.println("Error: Member " + memberId + " not found.");
        }
    }
}