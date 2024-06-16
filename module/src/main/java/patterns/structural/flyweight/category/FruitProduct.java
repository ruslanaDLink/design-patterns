package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class FruitProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteFruit;

    public FruitProduct(String concreteFruit) {
        this.concreteFruit = concreteFruit;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteFruit;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.FRUIT;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 1, 14);
    }
}
