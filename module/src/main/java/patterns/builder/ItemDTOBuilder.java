package patterns.builder;

public interface ItemDTOBuilder {

    ItemDTOBuilder buildName(String itemName);
    ItemDTOBuilder builtMaterial(String itemMaterial);
    ItemDTOBuilder builtCountryName(String countryOfOrigin);
    ItemDTOBuilder builtPrice(double itemPrice);

    ItemDTO built();
}
