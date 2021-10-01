package com.example.exoevalcabinet.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Data
@Table(name = "deplacement")
public class Deplacement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "cout")
    private double cout;

    @ManyToOne
    private Patient patient;

    @ManyToOne
    private Infirmiere infirmiere;


}
