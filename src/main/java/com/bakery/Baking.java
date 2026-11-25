package com.bakery;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bakings")
public class Baking {
    @Id
    @Column(name = "baking_number")
    private int bakingNumber;

    @Column(name = "baking_date")
    private LocalDate bakingDate;

    @Column(name = "product_name", length = 100)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "oven_name")
    private Oven oven;

    public Baking() {
    }

    public Baking(int bakingNumber, LocalDate bakingDate, String productName, Oven oven) {
        this.bakingNumber = bakingNumber;
        this.bakingDate = bakingDate;
        this.productName = productName;
        this.oven = oven;
    }

    public int getBakingNumber() {
        return bakingNumber;
    }

    public void setBakingNumber(int bakingNumber) {
        this.bakingNumber = bakingNumber;
    }

    public LocalDate getBakingDate() {
        return bakingDate;
    }

    public void setBakingDate(LocalDate bakingDate) {
        this.bakingDate = bakingDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Oven getOven() {
        return oven;
    }

    public void setOven(Oven oven) {
        this.oven = oven;
    }
}