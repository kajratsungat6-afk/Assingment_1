public class Customer {
    private int id;
    private String name;

    public Customer (int id, String name){
        this.id = id;
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }

    public void getId() {
        System.out.println(id);
    }
}
