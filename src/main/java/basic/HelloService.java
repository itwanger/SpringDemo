package basic;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void hello (String what) {
        System.out.println("basic " + what);
    }
}
