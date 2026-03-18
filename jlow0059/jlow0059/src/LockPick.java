public class LockPick extends Item {
    public LockPick(String brand, double weight) {
        super(brand, weight);
    }

    @Override
    public String toString() {

        return String.format("%s (%s) has weight of %.2f kg - to unlock door/treasure box",
                this.getClass().getSimpleName(),
                getBrand(),
                getWeight());
    }
}
