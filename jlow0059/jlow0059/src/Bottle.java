public class Bottle extends Item {
    private double capacity;

    public Bottle(String brand, double weight, double capacity) {
        super(brand, weight);
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return String.format("%s (%s) has weight of %.2f kg - to drink, with %.1f liter left.",
                this.getClass().getSimpleName(),
                getBrand(),
                getWeight(),
                capacity);
    }
}
