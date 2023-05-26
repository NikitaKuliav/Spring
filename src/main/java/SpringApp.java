import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver carDriver = context.getBean("carDriver", Driver.class);
        Driver busDriver = context.getBean("busDriver", Driver.class);
        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);

        carDriver.start();
        busDriver.start();
        pickupDriver.start();

        System.out.println("--- Spring Beans ---");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            if (beanName.contains("Driver")){
                System.out.println(beanName);
            }
        }
        context.close();

    }
}
