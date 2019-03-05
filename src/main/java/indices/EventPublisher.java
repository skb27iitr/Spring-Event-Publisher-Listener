package indices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import indices.SomeEvent.EventType;
import org.springframework.stereotype.Component;

/**
 * Created by sachin.bansal on 3/4/2019.
 */
@Component
public class EventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void Start(){
        SomeEvent event = new SomeEvent(EventType.STARTED);
        System.out.println(event.getTimestamp());

        System.out.println("I am ready to publish event");
        applicationEventPublisher.publishEvent(event);
        System.out.println("Event published");
    }

}
