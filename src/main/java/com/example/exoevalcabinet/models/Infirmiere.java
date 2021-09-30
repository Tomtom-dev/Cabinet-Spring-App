package com.example.exoevalcabinet.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "infirmiere")
public class Infirmiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero_professionnel")
    private Long numero_professionnel;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tel_pro")
    private String tel_pro;

    @Column(name="tel_perso")
    private String tel_perso;
}
