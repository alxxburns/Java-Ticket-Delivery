// Test for TicketDeliveryController
public class TestTicketDeliveryController {
    public static void main(String[] args) {
        TicketDeliveryController controller = new TicketDeliveryController();

        // Add some deliveries
        controller.addDelivery();
        controller.addDelivery();
        controller.addDelivery();

        // Display the details of a delivery
        controller.searchDelivery();

        // Display the cost per delivery report
        controller.costPerDeliveryReport();
    }
}
