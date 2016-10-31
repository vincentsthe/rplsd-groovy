package ecom

public class DataHolder {

    static List<Category> categoryList

    static List<Order> orderList

    static ShoppingCart shoppingCart

    static def populate() {
        categoryList = new ArrayList<>()
        categoryList.add(new Category(1, "Komputer"))
        categoryList.add(new Category(2, "Fashion"))
        categoryList.add(new Category(3, "Gadget"))
        categoryList.add(new Category(4, "Aksesoris"))
        categoryList.add(new Category(5, "Olahraga"))
        categoryList.add(new Category(6, "Dapur"))

        shoppingCart = new ShoppingCart()
        orderList = new ArrayList<>()
    }
}
