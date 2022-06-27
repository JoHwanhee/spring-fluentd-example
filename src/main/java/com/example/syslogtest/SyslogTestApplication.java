package com.example.syslogtest;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Slf4j
public class SyslogTestApplication {

    @RestController
    public static class Ctrl {

        @GetMapping("hello")
        public String test() {
            log.info("hello");
            throw new IllegalStateException("bbb");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SyslogTestApplication.class, args);
    }

}
