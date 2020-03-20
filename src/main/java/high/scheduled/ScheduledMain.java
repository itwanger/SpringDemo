package high.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScheduledMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }
}
