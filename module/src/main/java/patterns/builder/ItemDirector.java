package patterns.builder;

public class ItemDirector {

    public ItemDTO build(ItemDTOBuilder builder, Item item) throws MissingArgumentException {
        if (item.getName() == null) {
            throw new MissingArgumentException("NAME");
        } else if (item.getMaterial() == null) {
            throw new MissingArgumentException("MATERIAL");
        } else if (item.getCountry() == null) {
            throw new MissingArgumentException("COUNTRY");
        } else if (item.getPrice() <= 0) {
            throw new MissingArgumentException("PRICE");
        }
        return builder
                .buildName(item.getName())
                .builtMaterial(item.getMaterial())
                .builtCountryName(item.getCountry())
                .builtPrice(item.getPrice())
                .built();
    }
}
