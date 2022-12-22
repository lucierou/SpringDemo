package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {

    @Id
    @GeneratedValue
    private int id;

    private String marque;

    private String reference;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    private double prix;

    private int stock;
}
