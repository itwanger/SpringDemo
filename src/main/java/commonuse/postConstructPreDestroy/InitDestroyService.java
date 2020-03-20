package commonuse.postConstructPreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class InitDestroyService {
    public InitDestroyService() {
        System.out.println("构造方法");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁");
    }
}
