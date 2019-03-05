package indices;

import org.springframework.context.ApplicationEvent;

/**
 * Created by sachin.bansal on 3/4/2019.
 */
public class SomeEvent extends ApplicationEvent {

    public SomeEvent(EventType eventType) {
        super(eventType);
        this.setEventType(eventType);
    }

    public enum EventType {
        STARTED,
        COMPLETED,
        FAILED;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    private EventType eventType;

//    SomeEvent(EventType eventType){
//        this.eventType = eventType;
//    }

}
