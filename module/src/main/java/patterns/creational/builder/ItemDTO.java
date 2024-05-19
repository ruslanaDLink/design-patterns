package patterns.creational.builder;

public record ItemDTO(String name, String material, String country, double price) {
    public static ItemDTOBuilderExecutor getBuilder() {
        return new ItemDTOBuilderExecutor();
    }
}
