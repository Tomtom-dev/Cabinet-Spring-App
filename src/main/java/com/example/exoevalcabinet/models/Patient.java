package com.example.exoevalcabinet.models;

import com.example.exoevalcabinet.models.enums.Type;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


@Data
@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_de_naissance")
    private Timestamp date_de_naissance;

    @Column(name = "sexe")
    @Enumerated(EnumType.STRING)
    private Type sexe;

    @Column(name ="numero_securite_sociale")
    private Long numero_securite_sociale;

    @OneToOne
    @JoinColumn(name = "infirmier_id", referencedColumnName = "id")
    private Infirmiere infirmiere;
}
