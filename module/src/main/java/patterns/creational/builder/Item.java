package patterns.creational.builder;

public class Item {
    private String name;
    private String material;
    private String country;
    private double price;

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getCountry() {
        return country;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
