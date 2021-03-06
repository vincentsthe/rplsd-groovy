package ecom;

public class Main {

    static void main(String[] args) {
        DataHolder.populate()

        Reader reader = new BufferedReader(new InputStreamReader(System.in))
        for (;;)
        {
            String line = reader.readLine()

            String[] words = line.split(" ")
            if ((words.length == 2) && (words[0].equals("list")) && (words[1].equals("category"))) {
                listCategory()
            }
            if ((words.length == 4) && (words[0].equals("search")) && (words[1].equals("product")) && (words[2].equals("in"))) {
                searchProductInCategory(words[3])
            }
            if ((words.length == 4) && (words[0].equals("show")) && (words[1].equals("product")) && (words[2].equals("detail"))) {
                showProductDetail(words[3])
            }
        }
    }

    static def listCategory() {
        List<Category> categoryList = DataHolder.categoryList

        for (category in categoryList) {
            println("$category.id. $category.name")
        }
    }

    static def searchProductInCategory(String categoryName) {
        List<Category> categoryList = DataHolder.categoryList
        Category c = new Category()
        for (category in categoryList) {
            if (categoryName.equals(category.name)) {
                c = category
            }
        }

        for (product in c.productList) {
            println("$product.id. $product.name $product.price $product.description ")
        }
    }

    static def showProductDetail(String productName) {
        List<Product> productList = DataHolder.productList
        for (product in productList) {
            if (productName.equals(product.name)) {
                println("Product ID : $product.id")
                println("Product Name : $product.name")
                println("Product Price : $product.price")
                println("Product Description : $product.description ")
            }
        }
    }
}
