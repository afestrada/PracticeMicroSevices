package com.prueba.mspersona.model;

import lombok.*;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class CustomerPk implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "tipodocumento")
    protected String documentType;
    @Column(name = "numerodocumento")
    private String documentNumber;
}