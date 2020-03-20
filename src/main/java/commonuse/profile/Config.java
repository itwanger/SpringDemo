package commonuse.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
    @Bean
    @Profile("dev")
    public Datasource devDatasource() {
        return new Datasource("开发环境");
    }

    @Bean
    @Profile("prod")
    public Datasource prodDatasource() {
        return new Datasource("正式生产环境");
    }
}
