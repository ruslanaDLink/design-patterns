package patterns.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemDirectorTest {

    @Test
    void build() throws MissingArgumentException {
        //given
        ItemDirector director = new ItemDirector();
        Item item = new Item();

        //when
        item.setName("White T-Shirt");
        item.setMaterial("Polyester");
        item.setCountry("Bangladesh");
        item.setPrice(2.5);

        ItemDTO builtItem = director.build(ItemDTO.getBuilder(), item);

        //then
        Assertions.assertNotNull(builtItem, "Builder Pattern failed to function. Built object is null.");
    }
}