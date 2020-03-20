package high.thread.executor.method;

import org.springframework.scheduling.annotation.Async;

public class AsyncService {
    @Async("threadPoolTaskExecutor")
    public void execute() {
        System.out.println(Thread.currentThread().getName());
    }
}
