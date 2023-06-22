package com.jordi.apitriolet.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encargado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class encargado {

    @Column(name = "id_encargado")
    @Id
    private String id_encargado;
    @Column(name = "nombre")
    private String nombre;


}
