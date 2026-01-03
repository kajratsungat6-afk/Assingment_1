import java.util.ArrayList;

public class Order {
    ArrayList<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item){
        if (item.getName() != null && item.getPrice() != 0) {
            items.add(item);
        }
        else{
            return;
        }
    }

    public boolean negPrice(){
        for (MenuItem i : items) {
            if (i.getPrice() < 0){
                return false;
            }
        }
        return true;
    }

    public void allItem(){
        for (MenuItem i : items) {
            System.out.println(i.getName());
        }
    }

    public void totalPrice(){
        int price = 0;
        for (MenuItem i : items){
            price += i.getPrice();
        }
        System.out.println(price);
    }

}
