package com.prueba.mspersona.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "pacientes", schema = "prueba")
public class Patient {

    @EmbeddedId
    private PatientPk id;
    @Column(name = "nombrecompleto")
    private String name;
}
