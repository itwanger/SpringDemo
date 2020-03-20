package basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloConfig.class);
        HelloService helloService = context.getBean(HelloService.class);
        helloService.hello("66666");
        context.close();
    }
}
