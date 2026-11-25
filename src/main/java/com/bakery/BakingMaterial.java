package com.bakery;

import javax.persistence.*;

@Entity
@Table(name = "baking_materials")
public class BakingMaterial {
    @EmbeddedId
    private BakingMaterialId id;

    @ManyToOne
    @MapsId("bakingNumber")
    @JoinColumn(name = "baking_number")
    private Baking baking;

    @ManyToOne
    @MapsId("materialName")
    @JoinColumn(name = "material_name")
    private RawMaterial rawMaterial;

    @Column(name = "actual_quantity")
    private float actualQuantity;

    public BakingMaterial() {
    }

    public BakingMaterial(Baking baking, RawMaterial rawMaterial, float actualQuantity) {
        this.id = new BakingMaterialId(baking.getBakingNumber(), rawMaterial.getMaterialName());
        this.baking = baking;
        this.rawMaterial = rawMaterial;
        this.actualQuantity = actualQuantity;
    }

    public BakingMaterialId getId() {
        return id;
    }

    public void setId(BakingMaterialId id) {
        this.id = id;
    }

    public Baking getBaking() {
        return baking;
    }

    public void setBaking(Baking baking) {
        this.baking = baking;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    public float getActualQuantity() {
        return actualQuantity;
    }

    public void setActualQuantity(float actualQuantity) {
        this.actualQuantity = actualQuantity;
    }
}