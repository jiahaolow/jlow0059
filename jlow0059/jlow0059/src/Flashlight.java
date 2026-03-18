public class Flashlight extends Item {
    public Flashlight(String brand, double weight) {
        super(brand, weight);
    }

    @Override
    public String toString() {

        return String.format("%s (%s) has weight of %.2f kg - to emit light.",
                this.getClass().getSimpleName(),
                getBrand(),
                getWeight());
    }
}
