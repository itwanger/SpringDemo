package high.aware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
//    @Bean
    @Bean(name = "myCustomBeanName")
    public MyBeanName getMyBeanName() {
        return new MyBeanName();
    }

    @Bean
    public MyBeanFactory getMyBeanFactory() {
        return new MyBeanFactory();
    }
}
