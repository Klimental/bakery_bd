package com.bakery;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/*
  Колекція, в якій зберігаються документи бази даних MongoDB, що представляють сутність рядка з таблиці випікань пекарні.
*/
@Document(collection = "bakery-bakings")
public class Baking {
    @Id
    private String id;

    @Field("baking_number")
    private String bakingNumber;

    @Field("baking_date")
    private String bakingDate;

    @Field("product")
    private String product;

    @Field("oven")
    private String oven;

    @Field("oven_capacity_kg")
    private String ovenCapacityKg;

    @Field("used_raw_materials")
    private String usedRawMaterials;

    public Baking() {
    }

    public Baking(String bakingNumber, String bakingDate, String product, String oven, String ovenCapacityKg, String usedRawMaterials) {
        this.bakingNumber = bakingNumber;
        this.bakingDate = bakingDate;
        this.product = product;
        this.oven = oven;
        this.ovenCapacityKg = ovenCapacityKg;
        this.usedRawMaterials = usedRawMaterials;
    }

    @Override
    public String toString() {
        return "Baking {" +
                " id=\"" + id + "\"\n" +
                " bakingNumber=\"" + bakingNumber + "\"\n" +
                " bakingDate=\"" + bakingDate + "\"\n" +
                " product=\"" + product + "\"\n" +
                " oven=\"" + oven + "\"\n" +
                " ovenCapacityKg=\"" + ovenCapacityKg + "\"\n" +
                " usedRawMaterials=\"" + usedRawMaterials + "\"\n" +
                "}";
    }
}