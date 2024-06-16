package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class DryGoodProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteDryGood;

    public DryGoodProduct(String concreteDryGood) {
        this.concreteDryGood = concreteDryGood;
    }

    @Override
    public double setPrice(double price) {
        return 0;
    }

    @Override
    public String getConcreteItem() {
        return concreteDryGood;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.DRY_GOOD;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 120, 365);
    }
}
