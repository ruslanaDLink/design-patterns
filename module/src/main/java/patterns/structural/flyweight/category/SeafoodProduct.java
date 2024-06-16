package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class SeafoodProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteSeafood;

    public SeafoodProduct(String concreteSeafood) {
        this.concreteSeafood = concreteSeafood;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteSeafood;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.SEAFOOD;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 1, 3);
    }
}
