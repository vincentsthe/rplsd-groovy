package ecom;

public class ShoppingCart {

    int id;

    List<Product> productList;

    ShoppingCart() {
        productList = new ArrayList<>();
    }

    def addItem(Product item) {
        productList.add(item);
    }

    def reset() {
        productList = new ArrayList<>();
    }
}
