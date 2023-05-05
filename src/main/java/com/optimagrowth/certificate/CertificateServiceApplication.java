package com.optimagrowth.certificate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
//@EnableCaching
public class CertificateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CertificateServiceApplication.class, args);
    }

}
