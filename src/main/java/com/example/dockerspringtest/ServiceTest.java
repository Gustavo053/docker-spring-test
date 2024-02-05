package com.example.dockerspringtest;

import io.opentelemetry.api.internal.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServiceTest {

    private final Logger LOGGER = LoggerFactory.getLogger(ServiceTest.class);

    public String sayHello(String valueParam) {
        LOGGER.debug("chamei o serviço");

        if (StringUtils.isNullOrEmpty(valueParam)) {
            LOGGER.debug("Tive um erro");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ERRO - Sem parâmetro");
        }

        return "Hello! This application are running in a docker container";
    }
}
