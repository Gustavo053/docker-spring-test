package com.example.dockerspringtest;

import io.opentelemetry.api.internal.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(path = "/")
public class HelloController {

    private final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ServiceTest serviceTest;

    @GetMapping
    public String hello(@RequestParam(name = "param", required = false) String valueParam) {

        LOGGER.debug("Entrei no controlador");

        return serviceTest.sayHello(valueParam);
    }
}
