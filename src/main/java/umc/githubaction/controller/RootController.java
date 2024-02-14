package umc.githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "나 멀쩡해";
    }
}
