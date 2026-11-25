package com.bakery;

import javax.persistence.*;

@Entity
@Table(name = "raw_materials")
public class RawMaterial {
    @Id
    @Column(name = "material_name", length = 100)
    private String materialName;

    @Column(name = "unit_of_measure", length = 100)
    private String unitOfMeasure;

    @Column(name = "storage_conditions", length = 100)
    private String storageConditions;

    public RawMaterial() {
    }

    public RawMaterial(String materialName, String unitOfMeasure, String storageConditions) {
        this.materialName = materialName;
        this.unitOfMeasure = unitOfMeasure;
        this.storageConditions = storageConditions;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getStorageConditions() {
        return storageConditions;
    }

    public void setStorageConditions(String storageConditions) {
        this.storageConditions = storageConditions;
    }
}