package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class CondimentProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteCondiment;

    public CondimentProduct(String concreteCondiment) {
        this.concreteCondiment = concreteCondiment;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteCondiment;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.CONDIMENT;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 30, 180);
    }
}
