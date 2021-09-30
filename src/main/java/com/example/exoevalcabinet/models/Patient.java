package com.example.exoevalcabinet.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "cp")
    private String cp;

    @Column(name = "ville")
    private String ville;

}
