public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer(1, "Leonardo");
        MenuItem item1 = new MenuItem("Coffee", 700);
        MenuItem item2 = new MenuItem("Cake", 850);
        MenuItem item3 = new MenuItem(null, 1000);
        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        Cafe cafe = new Cafe();
        cafe.placeOrder(customer1, order);
    }
}
