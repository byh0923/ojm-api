package sy.ojm.ojmapi.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sy.ojm.ojmapi.dto.FeedbackDTO;

import java.util.Map;

@CrossOrigin(origins = {
        "http://localhost:3000",
        "http://skok1025.shop:3000",
        "http://select-lunch.shop:3000",
        "https://select-lunch.shop",
        "https://shkim3000.cafe24.com:9090"
})
@RestController
@RequestMapping(("/api/scape"))
public class WebScrapingController {
    private final RestTemplate restTemplate;

    public WebScrapingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/kakao-review")
    public ResponseEntity<FeedbackDTO> scrape(@RequestParam("place-id") String placeId) {
        try {
            String mapUrl = "https://place.map.kakao.com/main/v/";
            // 'feedback' 필드 추출 및 DTO 객체 생성
            FeedbackDTO feedbackDTO = restTemplate.getForObject(mapUrl + placeId, FeedbackDTO.class);

            return ResponseEntity.ok(feedbackDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

}
