public class Item {
    private String name;
    private double price;

    public Item(String name, double price, int index) {
        this.name = name;
        this.price = price;
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice() {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }
}
