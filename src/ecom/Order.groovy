package ecom

public class Order {

    int id

    Date orderDate;

    List<Product> itemList;

    Order(List<Product> itemList) {
        orderDate = new Date()
        this.itemList = itemList
    }
}
