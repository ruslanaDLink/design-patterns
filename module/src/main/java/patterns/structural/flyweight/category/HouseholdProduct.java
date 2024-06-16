package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class HouseholdProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concreteHouseholdProduct;

    public HouseholdProduct(String concreteHouseholdProduct) {
        this.concreteHouseholdProduct = concreteHouseholdProduct;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concreteHouseholdProduct;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.HOUSEHOLD;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 180, 1096);
    }
}
