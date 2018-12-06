package top.iyuhp.pipelinedemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dylan
 * @since 2018/12/6
 */
@RestController
@RequestMapping("/api")
public class HealthChecks {

    @RequestMapping("/ping")
    public String healthCheck() {
        return "PONG";
    }

}
