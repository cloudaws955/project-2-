package net.codingme.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 *
 * @Author niujinpeng
 * @Date 2018/12/4 14:41
 */
@Slf4j
@RestController
public class HelloController {

    @Value("${bootapp.description}")
    private String description;

    @RequestMapping("/")
    public String index() {
        log.info(description);
        return "Greetings from Spring Boot!";
    }

}
