package com.optimagrowth.certificate.redis.controller;

import com.optimagrowth.certificate.redis.servise.EstablishmentRedisService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
@RequestMapping("/v1/establishment-view")
public class EstablishmentRedisController {

    static Logger logger = LoggerFactory.getLogger(EstablishmentRedisController.class);
    EstablishmentRedisService establishmentRedisService;
    ModelMapper modelMapper;

}
