import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        items.add(item);
    }

    int price = 0;
    public void totalPrice() {
        System.out.println("Ordered");
        for (MenuItem i : items) {
            price += i.getPrice();
            System.out.println(i.getName());
        }
        if (price  == 0){
            System.out.println("Wrong order");
            return;
        }
        System.out.println("The total price is " + price);
    }
}
