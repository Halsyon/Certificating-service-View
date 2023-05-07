package com.optimagrowth.certificate.redis.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("organization")
public class EstablishmentView implements Serializable {
    @Id
    String id;
    //....
}