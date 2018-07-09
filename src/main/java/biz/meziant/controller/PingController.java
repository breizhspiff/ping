package biz.meziant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ronan on 26/10/16.
 */
@RestController
@RequestMapping("/ping")
public class PingController {

    @RequestMapping(method = RequestMethod.GET)
    public String ping(){
        return "pong";
    }

}
