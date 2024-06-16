package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class CosmeticsProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteCosmetics;

    public CosmeticsProduct(String item) {
        this.concreteCosmetics = item;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteCosmetics;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.COSMETICS;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 180, 720);
    }
}
