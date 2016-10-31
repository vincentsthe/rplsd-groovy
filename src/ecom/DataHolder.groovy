package ecom

public class DataHolder {

    static List<Category> categoryList

    static List<Product> productList

    static List<Order> orderList

    static ShoppingCart shoppingCart

    static def populate() {
        categoryList = new ArrayList<>()
        productList = new ArrayList<>()

        Category komputer = new Category(1, "Komputer")
        Category fashion = new Category(2, "Fashion")
        Category gadget = new Category(3, "Gadget")
        Category aksesoris = new Category(4, "Aksesoris")
        Category olahraga = new Category(5, "Olahraga")
        Category dapur = new Category(6, "Dapur")

        Product asus = new Product(1, "Asus", 10000000, "Baru")
        Product baju = new Product(2, "Baju", 100000, "Putih")
        Product iPhone = new Product(3, "iPhone 7", 15000000, "Baru")
        Product headset = new Product(4, "Headset", 120000, "Baru")
        Product dumbbell = new Product(5, "Dumbbell", 2500000, "10kg")
        Product pisau = new Product(6, "Pisau", 125000, "Tajam")

        productList.add(asus)
        productList.add(baju)
        productList.add(iPhone)
        productList.add(headset)
        productList.add(dumbbell)
        productList.add(pisau)

        komputer.addProduct(asus)
        fashion.addProduct(baju)
        gadget.addProduct(iPhone)
        aksesoris.addProduct(headset)
        olahraga.addProduct(dumbbell)
        dapur.addProduct(pisau)

        categoryList.add(komputer)
        categoryList.add(fashion)
        categoryList.add(gadget)
        categoryList.add(aksesoris)
        categoryList.add(olahraga)
        categoryList.add(dapur)



        shoppingCart = new ShoppingCart()
        orderList = new ArrayList<>()
    }
}
