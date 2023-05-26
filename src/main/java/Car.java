import org.springframework.beans.factory.annotation.Qualifier;

public class Car extends Transport{

    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }
    @Override
    public void start() {
        System.out.println("Машина " + model + " заведена");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
