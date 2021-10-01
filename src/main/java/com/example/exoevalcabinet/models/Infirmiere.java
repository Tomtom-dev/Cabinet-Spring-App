package com.example.exoevalcabinet.models;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "infirmiere")
public class Infirmiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_professionnel")
    private Integer numero_professionnel;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "tel_pro")
    private String tel_pro;

    @Column(name="tel_perso")
    private String tel_perso;

//    @OneToMany
//    private List<Patient> patient;

    @ManyToOne
    private Adresse adresse;
}
