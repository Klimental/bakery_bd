package com.bakery;

import javax.persistence.*;

@Entity
@Table(name = "ovens")
public class Oven {
    @Id
    @Column(name = "oven_name", length = 100)
    private String ovenName;

    @Column(name = "capicity_kg")
    private int capicityKg;

    public Oven() {
    }

    public Oven(String ovenName, int capicityKg) {
        this.ovenName = ovenName;
        this.capicityKg = capicityKg;
    }

    public String getOvenName() {
        return ovenName;
    }

    public void setOvenName(String ovenName) {
        this.ovenName = ovenName;
    }

    public int getCapicityKg() {
        return capicityKg;
    }

    public void setCapicityKg(int capicityKg) {
        this.capicityKg = capicityKg;
    }
}