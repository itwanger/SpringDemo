package commonuse.singleton;

import commonuse.Writer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonConfig.class);
        Writer writer1 = context.getBean(Writer.class);
        Writer writer2 = context.getBean(Writer.class);

        System.out.println(writer1);
        System.out.println(writer2);

        writer1.setName("沉默王二");
        System.out.println(writer2.getName());

        context.close();
    }
}
