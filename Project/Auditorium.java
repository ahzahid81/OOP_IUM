package Project;

//443058333
// Abdul Hasib Zahid

class Auditorium {
    private int totalSeats;
    private int seatsOccupied;
    private String eventName;
    private String eventDate;
    private String eventTime;

    public Auditorium(int totalSeats) {
        this.totalSeats = totalSeats;
        this.seatsOccupied = 0;  // Initially no seats are occupied
        this.eventName = "";
        this.eventDate = "";
        this.eventTime = "";
    }

    public void bookAuditorium(String eventName, String eventDate, String eventTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        System.out.println("Auditorium booked for event: " + eventName + " on " + eventDate + " at " + eventTime);
    }

    public void eventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Time: " + eventTime);
    }

    public void displaySeats() {
        System.out.println("Available seats: " + (totalSeats - seatsOccupied));
    }
}
