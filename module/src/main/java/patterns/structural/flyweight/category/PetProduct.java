package patterns.structural.flyweight.category;

import patterns.structural.flyweight.GroceryCategory;
import patterns.structural.flyweight.Product;
import patterns.structural.flyweight.util.DateGenerator;

import java.util.Date;

public class PetProduct implements Product {
    private DateGenerator generator = new DateGenerator();

    private String concretePetCare;

    public PetProduct(String concretePetCare) {
        this.concretePetCare = concretePetCare;
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String getConcreteItem() {
        return concretePetCare;
    }

    @Override
    public GroceryCategory getCategory() {
        return GroceryCategory.PET_CARE;
    }

    @Override
    public Date producedDate() {
        return new Date();
    }

    @Override
    public Date expirationDate() {
        return generator.getExpirationDate(producedDate(), 365, 547);
    }
}
