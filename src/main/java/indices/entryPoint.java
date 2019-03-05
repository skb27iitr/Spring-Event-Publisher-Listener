package indices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created by sachin.bansal on 3/5/2019.
 */
@SpringBootApplication
@EnableAsync
public class entryPoint {
    public static void main(String[] args) {
        System.out.println("Application starting");
        SpringApplication.run(entryPoint.class, args);
    }
}
