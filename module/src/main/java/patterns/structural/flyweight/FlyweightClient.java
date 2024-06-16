package patterns.structural.flyweight;

public class FlyweightClient {
    private static GroceryCategory[] categories = GroceryCategory.values();

    public static void main(String[] args) {
        GroceryCategory randomCategory = getRandomCategory();
        Product product = new GroceryStore().extractItem(randomCategory, randomItem(randomCategory));
        System.out.println(product.getCategory() + ": " + product.getConcreteItem());
        System.out.println("Expiration date: "+product.expirationDate());
    }

    private static GroceryCategory getRandomCategory() {
        return categories[(int) (Math.random() * categories.length)];
    }

    private static String randomItem(GroceryCategory category) {
        String[] bakery = {"Bread", "Bun", "Pretzel", "Banana Bread"};
        String[] meat = {"Chicken", "Beef", "Pork"};
        String[] dairy = {"Cheese", "Butter", "Milk", "Sour Cream", "Yoghurt"};
        String[] deli = {"Tuna", "Prosciutto", "Pepperoni", "Salami"};
        String[] fruit = {"Apple", "Banana", "Orange", "Kiwi", "Grape", "Tangerine"};
        String[] cosmetics = {"Lipstick", "Eyeliner", "Mascara", "Lip Gloss", "Powder", "Lip Tint"};
        String[] household = {"Bleach", "Laundry Detergent"};
        String[] seafood = {"Tuna", "Shrimp", "Crab", "Lobster"};
        String[] pet = {"Dry Foods", "Wet Foods", "Raw Foods", "Fresh Foods"};
        String[] dryGood = {"Rice", "Flour", "Oats", "Beans", "Barley", "Baking Powder"};
        String[] condiment = {"Mustard", "Ketchup", "Mayonnaise", "Soy Sauce", "Salsa", "Barbeque Sauce"};
        String[] baby = {"Diapers", "Baby Powder", "Toys", "Baby Formula", "Baby Carrier"};

        if (category == GroceryCategory.BAKERY) {
            return bakery[(int) (Math.random() * bakery.length)];
        } else if (category == GroceryCategory.HOUSEHOLD) {
            return household[(int) (Math.random() * household.length)];
        } else if (category == GroceryCategory.SEAFOOD) {
            return seafood[(int) (Math.random() * seafood.length)];
        } else if (category == GroceryCategory.PET_CARE) {
            return pet[(int) (Math.random() * pet.length)];
        } else if (category == GroceryCategory.DRY_GOOD) {
            return dryGood[(int) (Math.random() * dryGood.length)];
        } else if (category == GroceryCategory.DELI) {
            return deli[(int) (Math.random() * deli.length)];
        } else if (category == GroceryCategory.MEAT) {
            return meat[(int) (Math.random() * meat.length)];
        } else if (category == GroceryCategory.DAIRY) {
            return dairy[(int) (Math.random() * dairy.length)];
        } else if (category == GroceryCategory.COSMETICS) {
            return cosmetics[(int) (Math.random() * cosmetics.length)];
        } else if (category == GroceryCategory.FRUIT) {
            return fruit[(int) (Math.random() * fruit.length)];
        } else if (category == GroceryCategory.CONDIMENT) {
            return condiment[(int) (Math.random() * condiment.length)];
        } else if (category == GroceryCategory.BABY_ITEM) {
            return baby[(int) (Math.random() * baby.length)];
        }
        return null;
    }
}
