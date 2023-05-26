public class Pickup extends Transport{
    private String model;

    public Pickup() {
    }

    public Pickup(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Пикап " + model + " заведен");
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
