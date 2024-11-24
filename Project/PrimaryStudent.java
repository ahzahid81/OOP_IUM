package Project;

//443058333
//Abdul Hasib Zahid

class PrimaryStudent extends Student {
    private double feeBalance;

    public PrimaryStudent(String id, String name, String classRoom, String section, String busId) {
        super(id, name, classRoom, section, busId);
        this.feeBalance = 10000; // Default initial fee balance
    }

    public void payFees(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Payment amount must be positive.");
            return;
        }
        if (amount > feeBalance) {
            System.out.println("Error: Payment exceeds remaining balance.");
            return;
        }
        feeBalance -= amount;
        System.out.println(name + " paid fees of $" + amount + ". Remaining balance: $" + feeBalance);
    }

    public void displayFeeStatus() {
        System.out.println("Remaining Fee Balance for " + name + ": $" + feeBalance);
    }
}