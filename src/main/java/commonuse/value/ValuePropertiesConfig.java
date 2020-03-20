package commonuse.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:value.properties",  encoding = "UTF-8")
public class ValuePropertiesConfig {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    public void output() {
        System.out.println("姓名：" + name + " 年纪：" + age);
    }
}