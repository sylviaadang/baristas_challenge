public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("drip coffee", 1.60);
        Item item2 = new Item("capuccino", 4.5);
        Item item3 = new Item("iced coffee", 2.0);
        Item item4 = new Item("mocha", 3.5);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("William");
        Order order4 = new Order("Muri");
        Order order5 = new Order("Sylvia");

        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

        System.out.println(order5.getStatusMessage());
        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        System.out.println(order5.getOrderTotal());
        order5.display();

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("banana", 2.00);
        coffeeKiosk.addMenuItem("coffee", 1.50);
        coffeeKiosk.addMenuItem("latte", 4.50);
        coffeeKiosk.addMenuItem("capuccino", 3.00);
        coffeeKiosk.addMenuItem("muffin", 4.00);

        coffeeKiosk.newOrder();

    }
}
