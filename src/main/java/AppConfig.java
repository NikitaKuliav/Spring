import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("Mercedes")
    public Car car() {
        return new Car("Mercedes");
    }

    @Bean("Volvo")
    public Bus bus() {
        return new Bus("Volvo");
    }

    @Bean("Ford")
    public Pickup pickup() {
        return new Pickup("Ford");
    }

    @Bean
    public Driver carDriver(@Qualifier("Mercedes") Transport transport) {
        return new Driver(transport, "James");
    }

    @Bean
    public Driver busDriver(@Qualifier("Volvo") Transport transport) {
        return new Driver(transport, "Charlie");
    }

    @Bean
    public Driver pickupDriver(@Qualifier("Ford") Transport transport) {
        return new Driver(transport, "Bobbi");
    }
}
