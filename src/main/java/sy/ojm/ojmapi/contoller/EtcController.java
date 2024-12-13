package sy.ojm.ojmapi.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EtcController {
    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }
}
