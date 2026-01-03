public class MenuItem {
    private String name;
    private int price;

    public MenuItem(String name, int price){
        this.name = name;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
