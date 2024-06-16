package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class DairyProduct implements Product {
    private DateGenerator generator = new DateGenerator();
    private String concreteDairy;

    public DairyProduct(String concreteDairy) {
        this.concreteDairy = concreteDairy;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteDairy;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.DAIRY;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 7, 30);
    }
}
