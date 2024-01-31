public class NextDayTicketDelivery extends TicketDelivery {
    // Additional fee per kg for next day delivery
    private static final double PER_KG_FEE = 20.0;

    // Constructor
    public NextDayTicketDelivery(String name, String address, String city, String country,
                                  String postcode, double weight, double costPerKg, String trackingNumber) {
        // Call the superclass constructor
        super(name, address, city, country, postcode, weight, costPerKg, trackingNumber);
    }

    // Override the calculateDeliveryCost method to add the per-kg fee
    public double calculateDeliveryCost() {
        return super.calculateDeliveryCost() + (getWeight() * PER_KG_FEE);
    }

    // Override the toString method
    public String toString() {
        return "Next Day Ticket Delivery: " + getName() + ", " + getAddress() + ", " + getCity() + ", " + getCountry() +
                ", " + getPostcode() + ", " + getWeight() + " grams, " + getCostPerKg() + " per kg, " + getTrackingNumber();
    }
}