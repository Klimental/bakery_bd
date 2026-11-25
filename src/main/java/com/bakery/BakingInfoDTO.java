package com.bakery;

import java.time.LocalDate;

public class BakingInfoDTO {
    private int bakingNumber;
    private LocalDate bakingDate;
    private String productName;
    private String ovenName;
    private int capicityKg;
    private String materialName;
    private String unitOfMeasure;
    private String storageConditions;
    private float actualQuantity;

    public BakingInfoDTO(int bakingNumber, LocalDate bakingDate, String productName, String ovenName, int capicityKg, String materialName, String unitOfMeasure, String storageConditions, float actualQuantity) {
        this.bakingNumber = bakingNumber;
        this.bakingDate = bakingDate;
        this.productName = productName;
        this.ovenName = ovenName;
        this.capicityKg = capicityKg;
        this.materialName = materialName;
        this.unitOfMeasure = unitOfMeasure;
        this.storageConditions = storageConditions;
        this.actualQuantity = actualQuantity;
    }

    public int getBakingNumber() {
        return bakingNumber;
    }

    public LocalDate getBakingDate() {
        return bakingDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getOvenName() {
        return ovenName;
    }

    public int getCapicityKg() {
        return capicityKg;
    }

    public String getMaterialName() {
        return materialName;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public float getActualQuantity() {
        return actualQuantity;
    }
}