package high.thread.executor.defualt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class AsyncConfig {
    @Bean
    public AsyncService getAsyncService() {
        return new AsyncService();
    }
}
