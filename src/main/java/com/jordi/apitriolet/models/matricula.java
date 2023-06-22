package com.jordi.apitriolet.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "matricula")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class matricula {

    @Column(name = "id_matricula")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_matricula;
    @Column(name = "apoderado")
    private String apoderado;
    @OneToOne
    @JoinColumn(name = "id_encargado")
    private encargado encar;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "tiempo")
    private int tiempo;
    @Column(name = "tipo_pago")
    private String tipo_pago;
    @Column(name = "monto")
    private double monto;
    @Column(name = "tipo_postulante")
    private String tipo_postulante;
    @Column(name = "nivel")
    private String nivel;
    @Column(name = "grado")
    private String grado;
}
