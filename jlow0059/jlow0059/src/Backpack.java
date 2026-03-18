public class Backpack {
    private Item[] items;

    public Backpack() {
        items = new Item[4];

        items[0] = new LockPick("Sparrows", 0.1);
        items[1] = new Flashlight("Imalent MS32", 2);
        items[2] = new SterilisationBox("SURTEX", 5);
        items[3] = new Bottle("Target", 1, 1);
    }

    public Item[] getItems() {
        return items;
    }
}
