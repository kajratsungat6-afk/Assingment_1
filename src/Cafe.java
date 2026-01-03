public class Cafe {
    public void placeOrder(Customer customer, Order order) {
        if (order.negPrice()) {
            System.out.println("The client " + customer.getName() + " ordered:");
            order.allItem();
            System.out.print("The total price is: ");
            order.totalPrice();
            return;
        }
        System.out.println("Wrong price");
    }
}
