package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString //Borrar
@Builder //Borrar
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = true)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;


}
