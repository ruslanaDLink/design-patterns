package patterns.structural.flyweight;

import patterns.structural.flyweight.category.BakeryProduct;
import patterns.structural.flyweight.category.CondimentProduct;
import patterns.structural.flyweight.category.CosmeticsProduct;
import patterns.structural.flyweight.category.DairyProduct;
import patterns.structural.flyweight.category.DeliProduct;
import patterns.structural.flyweight.category.DryGoodProduct;
import patterns.structural.flyweight.category.FruitProduct;
import patterns.structural.flyweight.category.HouseholdProduct;
import patterns.structural.flyweight.category.MeatProduct;
import patterns.structural.flyweight.category.PetProduct;
import patterns.structural.flyweight.category.SeafoodProduct;

import java.util.HashMap;
import java.util.Map;

//factory of items
public class GroceryStore {
    private Map<GroceryCategory, Product> groceries = new HashMap<>();

    public Product extractItem(GroceryCategory category, String item) {
        Product product = null;

        if (category == GroceryCategory.DAIRY) {
            product = new DairyProduct(item);
        } else if (category == GroceryCategory.FRUIT) {
            product = new FruitProduct(item);
        } else if (category == GroceryCategory.BAKERY) {
            product = new BakeryProduct(item);
        } else if (category == GroceryCategory.MEAT) {
            product = new MeatProduct(item);
        } else if (category == GroceryCategory.CONDIMENT) {
            product = new CondimentProduct(item);
        } else if (category == GroceryCategory.DELI) {
            product = new DeliProduct(item);
        } else if (category == GroceryCategory.COSMETICS) {
            product = new CosmeticsProduct(item);
        } else if (category == GroceryCategory.DRY_GOOD) {
            product = new DryGoodProduct(item);
        } else if (category == GroceryCategory.PET_CARE) {
            product = new PetProduct(item);
        } else if (category == GroceryCategory.SEAFOOD) {
            product = new SeafoodProduct(item);
        } else if (category == GroceryCategory.HOUSEHOLD) {
            product = new HouseholdProduct(item);
        }
        groceries.put(category, product);
        return product;
    }
}
