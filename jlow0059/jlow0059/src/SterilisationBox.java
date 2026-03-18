public class SterilisationBox extends Item {
    public SterilisationBox(String brand, double weight) {
        super(brand, weight);
    }

    @Override
    public String toString() {
        return String.format("%s (%s) has weight of %.2f kg - to sterilise food.",
                this.getClass().getSimpleName(),
                getBrand(),
                getWeight());
    }
}
