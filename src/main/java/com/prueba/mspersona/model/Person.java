package com.prueba.mspersona.model;


import lombok.*;
import javax.persistence.*;


@Entity
@Table (name = "persona", schema = "prueba")

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "numerodocumento")
    private String documentNumber;
    @Column(name = "nombrecompleto")
    private String name;
}
