package weekidk.shop;

import java.util.ArrayList;
import java.util.List;

public class SMS {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProductById(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public void printInfo() {
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
