public class Bus extends Transport{
    private String model;

    public Bus() {
    }

    public Bus(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Автобус " + model + " заведен");
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
