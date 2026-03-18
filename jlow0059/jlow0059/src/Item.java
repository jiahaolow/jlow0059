public class Item {
    private String brand;
    private double weight;

    public Item(String brand, double weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) has weight of %.2f kg",
                this.getClass().getSimpleName(),
                getBrand(),
                getWeight());
    }
}
