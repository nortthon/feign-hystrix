package io.github.nortthon.feign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlaveController {

    @PostMapping("/slave")
    public String post() throws InterruptedException {
        //Thread.sleep(5000L);
        return "slave";
    }
}
