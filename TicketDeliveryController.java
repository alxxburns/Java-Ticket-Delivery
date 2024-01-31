// Ticket Delivery Controller Class
import java.util.ArrayList;
import java.util.Scanner;

public class TicketDeliveryController {
    private ArrayList<TicketDelivery> deliveryList;

    // Constructor
    public TicketDeliveryController() {
        deliveryList = new ArrayList<TicketDelivery>();
    }

    // Public method to add a delivery
    public void addDelivery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What type of delivery do you wish to create? (1 for Standard, 2 for Next Day)");
        int deliveryType = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Please enter the name of the recipient: ");
        String name = sc.nextLine();
        System.out.println("Please enter the address of the recipient: ");
        String address = sc.nextLine();
        System.out.println("Please enter the city of the recipient: ");
        String city = sc.nextLine();
        System.out.println("Please enter the country of the recipient: ");
        String country = sc.nextLine();
        System.out.println("Please enter the postcode/zip of the recipient: ");
        String postcode = sc.nextLine();
        System.out.println("Please enter the weight of the ticket package in kilo"
        		+ "grams: ");
        double weight = sc.nextDouble();
        sc.nextLine(); // Consume the newline character left by nextDouble()
        System.out.println("Please enter the delivery tracking number (8 digits): ");
        String trackingNumber = sc.nextLine();

        // Create the appropriate delivery object based on user input
        TicketDelivery newDelivery;
        if (deliveryType == 1) {
            newDelivery = new StandardTicketDelivery(name, address, city, country, postcode, weight, weight, trackingNumber);
        } else if (deliveryType == 2) {
            newDelivery = new NextDayTicketDelivery(name, address, city, country, postcode, weight, weight, trackingNumber);
        } else {
            System.out.println("Invalid delivery type");
            return;
        }

        // Compute and display the total cost of the shipment
        double totalCost = newDelivery.calculateDeliveryCost();
        System.out.println("Total cost of shipment: " + totalCost);

        // Add the new delivery object to the ArrayList and display its details
        deliveryList.add(newDelivery);
        displayDeliveryDetails(newDelivery);
    }



    private void displayDeliveryDetails(TicketDelivery newDelivery) {
		
	}

	// Private method to get the index of a delivery object in the ArrayList based on its tracking number
    private int getIndex(String myDeliveryTrackingNumber) {
        for (int i = 0; i < deliveryList.size(); i++) {
            if (deliveryList.get(i).getTrackingNumber().equals(myDeliveryTrackingNumber)) {
                return i;
            }
        }
        return -1;
    }

    // Public method to search for a delivery object based on its tracking number
    public void searchDelivery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the delivery tracking number: ");
        String trackingNumber = sc.next();

        int index = getIndex(trackingNumber);
        if (index == -1) {
            System.out.println("Delivery not found");
        } else {
            displayDeliveryDetails(deliveryList.get(index));
        }
    }

    // Public method to compute and display the calculated cost per delivery for each instance in the ArrayList
    public void costPerDeliveryReport() {
        System.out.println("Cost per delivery report:");
        for (TicketDelivery delivery : deliveryList) {
            System.out.println(delivery.getTrackingNumber() + ": " + delivery.calculateDeliveryCost());
        }
    }
}

