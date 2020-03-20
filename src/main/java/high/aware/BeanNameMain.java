package high.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyBeanName myBeanName = context.getBean(MyBeanName.class);
        context.close();
    }
}
