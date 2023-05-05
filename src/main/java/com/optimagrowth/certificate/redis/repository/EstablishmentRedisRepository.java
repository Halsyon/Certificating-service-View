package com.optimagrowth.certificate.redis.repository;

import com.optimagrowth.certificate.redis.model.EstablishmentView;
import org.springframework.data.repository.CrudRepository;

public interface EstablishmentRedisRepository extends CrudRepository<EstablishmentView, String> {
}