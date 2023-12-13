package com.tobeto.pair8.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @ManyToOne
    @JoinColumn(name = "brands")
    private Brand brand;
}
