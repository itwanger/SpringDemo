package commonuse.postConstructPreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDestroyConfig {
    @Bean
    public InitDestroyService initDestroyService() {
        return new InitDestroyService();
    }
}
