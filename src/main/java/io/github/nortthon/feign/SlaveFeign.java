package io.github.nortthon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "slave-feign", url = "${feign.slave.url}")
public interface SlaveFeign {

    @PostMapping("/slave")
    String post();
}
