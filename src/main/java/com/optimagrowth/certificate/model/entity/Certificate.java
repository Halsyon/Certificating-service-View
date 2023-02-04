package com.optimagrowth.certificate.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
@Table(name = "certificate", schema = "certificate")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Certificate extends RepresentationModel<Certificate> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "certificate_id", nullable = false)
    String id;

    @Column(name = "comment")
    String comment;


    public Certificate withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
