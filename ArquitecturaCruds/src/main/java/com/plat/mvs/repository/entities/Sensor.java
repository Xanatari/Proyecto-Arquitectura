package com.plat.mvs.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "SENSOR")
@Data
@AllArgsConstructor
public class Sensor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @Column
    private String kilometro;

    @Column
    private String ubicacion;

    @Column
    private String tipo;

    @Column
    private String carretera;

    @Column
    private boolean estado;


    public Sensor() {

    }
}
