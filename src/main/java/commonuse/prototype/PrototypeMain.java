package commonuse.prototype;

import commonuse.Writer;
import commonuse.singleton.SingletonConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrototypeConfig.class);
        Writer writer1 = context.getBean(Writer.class);
        Writer writer2 = context.getBean(Writer.class);

        System.out.println(writer1.toString());
        System.out.println(writer2);

        writer1.setName("沉默王二");
        System.out.println(writer2.getName());

        context.close();
    }
}
