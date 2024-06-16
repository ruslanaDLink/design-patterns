package patterns.structural.flyweight;

import java.util.Date;

public interface Product {
    double setPrice(double price);

    String getConcreteItem();

    GroceryCategory getCategory();

    Date producedDate();

    Date expirationDate();
}
