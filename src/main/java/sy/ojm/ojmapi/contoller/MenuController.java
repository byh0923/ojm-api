package sy.ojm.ojmapi.contoller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(("/api"))
public class MenuController {

    @GetMapping("/menuTypes")
    public String menuTypes() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Map<String, String> map = new HashMap<>();
        map.put("korean", "한식");
        map.put("japanese", "일식");
        map.put("chinese", "중식");
        map.put("western", "양식");

        return mapper.writeValueAsString(map);
    }
}
