package indices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by sachin.bansal on 3/4/2019.
 */
@Component
public class eventListener {

    @Autowired
    private Contract contractService;

    @Async
    @EventListener
    public void doSomething(SomeEvent event) throws InterruptedException {
        System.out.println("Event received of type: " + event.getEventType());

        switch (event.getEventType()) {
            case FAILED:
                return;
            case STARTED:
                System.out.println("This thread will sleep for 15 seconds");
                Thread.sleep(15 * 1000);
                System.out.println("I am awake now");
                contractService.create();
                return;
            case COMPLETED:
                return;
        }

    }
}
