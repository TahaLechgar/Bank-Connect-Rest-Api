package ma.bankconnect.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class MainController {

    @GetMapping("/")
    public String home() {
        return "Welcome to BankConnect";
    }
}
