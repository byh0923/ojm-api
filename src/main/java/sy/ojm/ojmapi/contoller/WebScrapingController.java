package sy.ojm.ojmapi.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import sy.ojm.ojmapi.dto.FeedbackDTO;

import java.util.Map;

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
