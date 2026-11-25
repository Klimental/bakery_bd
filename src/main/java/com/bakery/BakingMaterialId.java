package com.bakery;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BakingMaterialId implements Serializable {
    @Column(name = "baking_number")
    private int bakingNumber;

    @Column(name = "material_name", length = 100)
    private String materialName;

    public BakingMaterialId() {
    }

    public BakingMaterialId(int bakingNumber, String materialName) {
        this.bakingNumber = bakingNumber;
        this.materialName = materialName;
    }

    public int getBakingNumber() {
        return bakingNumber;
    }

    public void setBakingNumber(int bakingNumber) {
        this.bakingNumber = bakingNumber;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BakingMaterialId that = (BakingMaterialId) o;
        return bakingNumber == that.bakingNumber && Objects.equals(materialName, that.materialName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bakingNumber, materialName);
    }
}