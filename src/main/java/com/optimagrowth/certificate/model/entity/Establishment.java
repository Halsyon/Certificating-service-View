package com.optimagrowth.certificate.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@Table(name = "establishment", schema = "establishment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Establishment extends RepresentationModel<Establishment> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "establisment_id")
    String id;

    @Column(name = "name")
    String name;

}