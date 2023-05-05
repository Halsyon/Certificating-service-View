package com.optimagrowth.certificate.controller;

import com.optimagrowth.certificate.model.entity.Certificate;
import com.optimagrowth.certificate.service.CertificateService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeoutException;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(value = "v1/establishment/{establishmentId}/certificate")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CertificateController {


    CertificateService certificateService;

    @GetMapping(value = "/")
    public List<Certificate> getAll(@PathVariable("establishmentId") String establishmentId) throws TimeoutException {

        return certificateService.getCertificateByEstablishment(establishmentId);
    }

    @GetMapping("/{certificateId}")
    public ResponseEntity<Certificate> getLicense(@PathVariable("establishmentId") String organizationId,
                                                  @PathVariable("certificateId") String licenseId
    ) {
        Certificate license = certificateService.getLicense(licenseId, organizationId);

        return ResponseEntity.ok(license);
    }

    @GetMapping(value = "/{certificateId}/{clientType}")
    public Certificate getLicensesWithClient(
            @PathVariable("establishmentId") String establishmentId,
            @PathVariable("certificateId") String licenseId,
            @PathVariable("clientType") String clientType
    ) {
        return certificateService.getCertificateByClientType(establishmentId, establishmentId, clientType);
    }

    @PutMapping()
    public ResponseEntity<Certificate> update(@RequestBody Certificate request) {
        var certificate = certificateService.updateCertificate(request);

        return ResponseEntity.ok(certificate);
    }

    @PostMapping
    public ResponseEntity<Certificate> create(
            @RequestBody Certificate request,
            @RequestHeader(value = "Accept-Language", required = false)
                    Locale locale
    ) {
        var license = certificateService.createCertificate(request);

        return ResponseEntity.ok(license);
    }

    @DeleteMapping("/{certificateId}")
    public ResponseEntity<Void> delete(@PathVariable("certificateId") String certificateId) {
        var license = certificateService.deleteCertificate(certificateId);

        return new ResponseEntity<>(license != null ? OK : NOT_FOUND);
    }
}
