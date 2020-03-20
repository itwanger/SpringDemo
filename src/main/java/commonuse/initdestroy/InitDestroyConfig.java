package commonuse.initdestroy;

import basic.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDestroyConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public InitDestroyService initDestroyService() {
        return new InitDestroyService();
    }
}
