package high.thread.executor.method;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AsyncService service = context.getBean(AsyncService.class);
        for (int i = 0; i < 10; i++) {
            service.execute();
        }
    }
}
