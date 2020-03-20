package commonuse.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfig.class);

        ValueConfig service = context.getBean(ValueConfig.class);
        service.output();

        context.close();
    }
}
