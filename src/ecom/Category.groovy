package ecom;

public class Category {

    int id;

    String name;

    List<Product> productList;

    Category() {
        this.id = 1
        this.name = "Komputer"
        productList = new ArrayList<>();
    }

    Category(int id, String name) {
        this.id = id
        this.name = name;
        productList = new ArrayList<>();
    }

    def addProduct(Product product) {
        productList.add(product)
    }
}