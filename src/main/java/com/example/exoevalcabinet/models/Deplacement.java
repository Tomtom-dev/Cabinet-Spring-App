package com.example.exoevalcabinet.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@Table(name = "deplacement")
public class Deplacement {

    // id, date, cout

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "cout")
    private double cout;
}
