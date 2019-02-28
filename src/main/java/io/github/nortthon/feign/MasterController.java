package io.github.nortthon.feign;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MasterController {

    private final SlaveFeign feign;

    @GetMapping("/test")
    public String get() {
        return feign.post();
    }
}
