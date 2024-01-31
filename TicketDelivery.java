// Ticket Delivery Program
public abstract class TicketDelivery {
    // Private data members
    private String name;
    private String address;
    private String city;
    private String country;
    private String postcode;
    private double weight;
    private double costPerKg;
    private String trackingNumber;

    // Constructor
    public TicketDelivery(String name, String address, String city, String country,
                          String postcode, double weight, double costPerKg, String trackingNumber) {
        // Set the private data members using the provided values
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.postcode = postcode;
        // Ensure that weight and costPerKg are positive values
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
        if (costPerKg > 0) {
            this.costPerKg = costPerKg;
        } else {
            this.costPerKg = 0;
        }
        this.trackingNumber = trackingNumber;
    }

    // Method to calculate the delivery cost
    public double calculateDeliveryCost() {
        return weight * costPerKg;
    }

    // Getter and setter methods for the private data members
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        // Ensure that weight is a positive value
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getCostPerKg() {
        return costPerKg;
    }

    public void setCostPerKg(double costPerKg) {
        // Ensure that costPerKg is a positive value
        if (costPerKg > 0) {
            this.costPerKg = costPerKg;
        }
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    // Abstract method to be implemented by subclasses
    public abstract String toString();
}


