package commonuse.postConstructPreDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitDestroyMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
        InitDestroyService service = context.getBean(InitDestroyService.class);
        System.out.println("准备关闭容器");
        context.close();
    }
}
