package patterns.builder;

public class ItemDTOBuilderExecutor implements ItemDTOBuilder {
    private String name;
    private String material;
    private String country;
    private double price;

    private ItemDTO itemDTO;

    @Override
    public ItemDTOBuilder buildName(String itemName) {
        name = itemName;
        return this;
    }

    @Override
    public ItemDTOBuilder builtMaterial(String itemMaterial) {
        material = itemMaterial;
        return this;
    }

    @Override
    public ItemDTOBuilder builtCountryName(String countryOfOrigin) {
        country = countryOfOrigin;
        return this;
    }

    @Override
    public ItemDTOBuilder builtPrice(double itemPrice) {
        price = itemPrice;
        return this;
    }

    @Override
    public ItemDTO built() {
        return itemDTO = new ItemDTO(name, material, country, price);
    }
}
