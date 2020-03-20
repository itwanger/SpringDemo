package commonuse.initdestroy;

public class InitDestroyService {
    public InitDestroyService() {
        System.out.println("构造方法");
    }

    public void init() {
        System.out.println("初始化");
    }

    public void destroy() {
        System.out.println("销毁");
    }
}
