package commonuse.singleton;

import commonuse.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonConfig {
    @Bean
    //@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Scope("singleton")
    public Writer getWriterSingleton() {
        return new Writer();
    }
}