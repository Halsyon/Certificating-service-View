package com.optimagrowth.certificate.service.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("establishment-service")
public interface EstablishmentFeignClient {
}
