package commonuse.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
//        environment.setActiveProfiles("prod");
        environment.setActiveProfiles("dev");
        context.register(Config.class);
        context.refresh();

        Datasource datasource = context.getBean(Datasource.class);
        System.out.println(datasource.getDburl());
        context.close();
    }
}
