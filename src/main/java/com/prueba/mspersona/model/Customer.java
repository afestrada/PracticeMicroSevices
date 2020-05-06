package com.prueba.mspersona.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "clientes", schema = "prueba")
public class Customer {
    @EmbeddedId
    private CustomerPk id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "apellido")
    private String lastName;
    @Column(name = "fechanacimiento")
    private Date birthdate;
    @Column(name = "sexo")
    private String sex;
}
