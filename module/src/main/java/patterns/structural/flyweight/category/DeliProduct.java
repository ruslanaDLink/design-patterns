package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class DeliProduct implements Product {
    private DateGenerator generator = new DateGenerator();
    private String concreteDeli;

    public DeliProduct(String concreteDeli) {
        this.concreteDeli = concreteDeli;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteDeli;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.DELI;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 3, 5);
    }
}
