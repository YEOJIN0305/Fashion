package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LoginController {

    @GetMapping(value = "login")
    public String findId() throws Exception {
        log.info(this.getClass().getName() + ".login Start!!");
        log.info(this.getClass().getName() + ".login End!!");
        return "login";
    }

}
