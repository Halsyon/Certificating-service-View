package com.optimagrowth.certificate.service;

import com.optimagrowth.certificate.config.ServiceConfig;
import com.optimagrowth.certificate.model.entity.Certificate;
import com.optimagrowth.certificate.repository.CertificateRepository;
import com.optimagrowth.certificate.service.client.EstablishmentFeignClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

/**
 * business logic has access to any values in the UserContext
 */
@Slf4j
@AllArgsConstructor
@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CertificateService {

    MessageSource messages;
    CertificateRepository certificateRepository;
    ServiceConfig config;
    EstablishmentFeignClient establishmentFeignClient;

    /**
     *
     */
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


    @CircuitBreaker(name = "certificateService", fallbackMethod = "buildFallbackLicenseList")
    @RateLimiter(name = "certificateService", fallbackMethod = "buildFallbackLicenseList")
    @Retry(name = "retryLicenseService", fallbackMethod = "buildFallbackLicenseList")
    public List<Certificate> getCertificateByEstablishment(String organizationId) throws TimeoutException {
        return null;
    }

    private List<Certificate> buildFallbackLicenseList(String organizationId, Throwable t) {

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
}

