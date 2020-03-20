package high.thread.executor.app;

import org.springframework.scheduling.annotation.Async;

public class AsyncService {
    @Async
    public void execute() {
        System.out.println(Thread.currentThread().getName());
    }
}
