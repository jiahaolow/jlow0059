public class Moon {
    private Crew crew;

    public Moon() {
        crew = new Crew("Misty");
    }

    public void simulate() {

        System.out.println("Welcome to FIT2099 Moon \n");

        // The following method will be implemented in the next few requirements
         crew.checkAllItems();

        System.out.println("\nAll the best with the exploration!");
    }
}
