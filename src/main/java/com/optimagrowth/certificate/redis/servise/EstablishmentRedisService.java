package com.optimagrowth.certificate.redis.servise;

import com.optimagrowth.certificate.model.entity.Certificate;
import com.optimagrowth.certificate.redis.model.EstablishmentView;
import com.optimagrowth.certificate.redis.repository.EstablishmentRedisRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.concurrent.TimeoutException;

@Service
@Transactional
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EstablishmentRedisService {

    static Logger LOGGER = LoggerFactory.getLogger(EstablishmentRedisService.class);

    MessageSource messages;

    EstablishmentRedisRepository repository;

    public Iterable<EstablishmentView> getAll() {
        return null;
    }

    public Certificate getEstablishmentByClientType(
            String licenseId,
            String organizationId,
            String clientType
    ) {

        return null;
    }


    private EstablishmentView establishmentInfo(
            String organizationId,
            String clientType
    ) {
        EstablishmentView organization = null;

        return null;
    }

    public List<Certificate> getCertificateByOrganization(String establishmentId) throws TimeoutException {

        return null;
    }

    public Optional<EstablishmentView> findById(String id) {
        return repository.findById(id);
    }

    public EstablishmentView create(EstablishmentView establishmentView) {
        return null;
    }

    public EstablishmentView update(EstablishmentView establishmentView) {
     return null;
    }

    public String delete(String establishmentId) {
        return null;
    }

    private boolean accessLevel(String userId) {
        return false;
    }
}
