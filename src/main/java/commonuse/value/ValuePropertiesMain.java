package commonuse.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValuePropertiesMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValuePropertiesConfig.class);

        ValuePropertiesConfig service = context.getBean(ValuePropertiesConfig.class);
        service.output();

        context.close();
    }
}
