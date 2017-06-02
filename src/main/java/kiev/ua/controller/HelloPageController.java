package kiev.ua.controller;

import kiev.ua.service.MainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloPageController {

    @Autowired
    private MainService service;

    private static final Logger logger = LoggerFactory.getLogger(HelloPageController.class);


}
