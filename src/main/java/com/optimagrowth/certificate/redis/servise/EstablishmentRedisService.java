/*
Copyright (c) 2016-2023 VMware Inc. or its affiliates, All Rights Reserved. [Halsyon]

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
