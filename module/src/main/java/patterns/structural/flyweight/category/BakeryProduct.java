package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class BakeryProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteBakery;

    public BakeryProduct(String concreteBakery) {
        this.concreteBakery = concreteBakery;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteBakery;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.BAKERY;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 1, 7);
    }
}
