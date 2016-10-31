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
        }
    }

    static def listCategory() {
        List<Category> categoryList = DataHolder.categoryList

        for (category in categoryList) {
            println("$category.id. $category.name")
        }
    }
}
