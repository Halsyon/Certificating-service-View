/*
Copyright (c) 2016-2023 VMware Inc. or its affiliates, All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.optimagrowth.certificate.service;

import com.optimagrowth.certificate.config.ServiceConfig;
import com.optimagrowth.certificate.events.model.OrganizationChangeModel;
import com.optimagrowth.certificate.model.entity.Certificate;
import com.optimagrowth.certificate.repository.CertificateRepository;
import com.optimagrowth.certificate.service.client.EstablishmentFeignClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

@AllArgsConstructor
@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CertificateService {

    MessageSource messages;
    CertificateRepository certificateRepository;
    ServiceConfig config;
    EstablishmentFeignClient establishmentFeignClient;

    public Certificate getLicense(
            String certificateId,
            String establishmentId
    ) {
        return null;
    }

    public Certificate getCertificateByClientType(
            String certificateId,
            String establishmentId,
            String clientType
    ) {
        return null;
    }

    @CircuitBreaker(name = "certificateService", fallbackMethod = "buildFallbackCertificateList")
    @RateLimiter(name = "certificateService", fallbackMethod = "buildFallbackCertificateList")
    @Retry(name = "retryCertificateService", fallbackMethod = "buildFallbackCertificateList")
    public List<Certificate> getCertificateByEstablishment(String organizationId) throws TimeoutException {
        return null;
    }

    private List<Certificate> buildFallbackLicenseList(
            String organizationId,
            Throwable t
    ) {

        return null;
    }


    public Optional<Certificate> findById(String id) {
        return certificateRepository.findById(id);
    }

    public Certificate createCertificate(Certificate certificate) {

        return null;
    }

    public Certificate updateCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public String deleteCertificate(String licenseId) {
        String responseMessage = null;

        return null;
    }

       public void loggerSink(OrganizationChangeModel orgChange) {
    }
}

