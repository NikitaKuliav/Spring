import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {

    private final Transport transport;
    private String name;

    public Driver(Transport transport) {
        this.transport = transport;
    }

    public Driver(Transport transport, String name) {
        this.transport = transport;
        this.name = name;
    }

    public void start() {
        System.out.println(name + " сел(а) в " + transport.getModel());
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "transport=" + transport +
                '}';
    }
}
