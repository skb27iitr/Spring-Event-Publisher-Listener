package indices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sachin.bansal on 3/5/2019.
 */
@RestController
public class mainController {

    @Autowired
    private EventPublisher eventPublisher;

    @GetMapping(value = "/idx/start")
    public String start(HttpServletRequest request) {
        //logger.trace("Pinging.......info");
        eventPublisher.Start();
        return "Caller: " + request.getRemoteAddr() + ", Responder: " + request.getLocalAddr();
    }

    @GetMapping(value = "/idx/end")
    public String end(HttpServletRequest request) {
        //logger.trace("Pinging.......info");
        eventPublisher.Start();
        return "Caller: " + request.getRemoteAddr() + ", Responder: " + request.getLocalAddr();
    }
}
