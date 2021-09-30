package com.example.exoevalcabinet.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "adresse",
uniqueConstraints = {
        @UniqueConstraint(name = "adresse_unique", columnNames = "numero")
})
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="numero")
    private String numero;

    @Column(name = "rue")
    private String rue;

    @Column(name = "cp")
    private String cp;

    @Column(name = "ville")
    private String ville;

}
