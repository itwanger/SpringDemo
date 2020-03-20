package commonuse.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

public class ValueConfig {
    @Value("沉默王二")
    private String name;

@Value("#{18 + 12}")
private int add;

    @Value("#{1 == 1}") // true
    private boolean equal;

    @Value("#{400 > 300 || 150 < 100}") // true
    private boolean or;

@Value("#{2 > 1 ? '沉默是金' : '不再沉默'}") // "沉默是金"
private String ternary;


    public void output() {
        System.out.println(name);

        System.out.println(add);

        System.out.println(equal);
        System.out.println(or);

        System.out.println(ternary);
    }
}