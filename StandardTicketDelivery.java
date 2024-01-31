public class StandardTicketDelivery extends TicketDelivery {
    // Additional flat fee for standard delivery
    private static final double FLAT_FEE = 10.0;

    // Constructor
    public StandardTicketDelivery(String name, String address, String city, String country,
                                   String postcode, double weight, double costPerKg, String trackingNumber) {
        // Call the superclass constructor
        super(name, address, city, country, postcode, weight, costPerKg, trackingNumber);
    }

    // Override the calculateDeliveryCost method to add the flat fee
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() + FLAT_FEE;
    }

    // Override the toString method
    // Override the toString method
    public String toString() {
        return "Standard Ticket Delivery: " + getName() + ", " + getAddress() + ", " + getCity() + ", " + getCountry() +
                ", " + getPostcode() + ", " + getWeight() + " grams, " + getCostPerKg() + " per kg, " + getTrackingNumber();
    }
}

