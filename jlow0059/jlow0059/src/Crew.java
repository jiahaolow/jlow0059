public class Crew {
    private String name;
    private Backpack backpack;
    
    public Crew(String name) {
        this.name = name;
        this.backpack = new Backpack();
    }

    public void checkAllItems() {
        System.out.println("Here are the items that " + name + " has in the backpack:\n");

        Item[] items = backpack.getItems();

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
