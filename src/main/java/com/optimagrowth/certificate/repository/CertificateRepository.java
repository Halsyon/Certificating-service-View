package com.optimagrowth.certificate.repository;

import com.optimagrowth.certificate.model.entity.Certificate;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CertificateRepository extends CrudRepository<Certificate, String> {

    List<Certificate> findByEstablishmentId(String establishmentId);

    Certificate findByEstablishmentAndCertificateId(String establishmentId, String certificateId);
}
