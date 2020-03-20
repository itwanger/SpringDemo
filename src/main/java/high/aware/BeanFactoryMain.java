package high.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyBeanFactory myBeanFactory = context.getBean(MyBeanFactory.class);
        myBeanFactory.getMyBeanName();
        context.close();
    }
}
