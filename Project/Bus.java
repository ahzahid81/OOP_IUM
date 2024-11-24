package Project;

//443058333
//Abdul Hasib Zahid

class Bus {
    private String busId;
    private String driverName;
    private String route;
    private int capacity;

    public Bus(String busId, String driverName, String route, int capacity) {
        this.busId = busId;
        this.driverName = driverName;
        this.route = route;
        this.capacity = capacity;
    }

    public void busDetails() {
        System.out.println("Bus ID: " + busId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Route: " + route);
        System.out.println("Capacity: " + capacity);
    }

    public boolean isOnTime() {
        return true; // Placeholder for demonstration
    }
}