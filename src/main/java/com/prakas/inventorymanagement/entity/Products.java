/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.inventorymanagement.entity;

/**
 *
 * @author Prakas
 */
public class Products {
    private int id;
    private String name,description,quantity,price,margin;
    private boolean status;
    private int suppliersId,recordLabel;

    public Products() {
    }

    public Products(int id, String name, String description, String quantity, String price, String margin, boolean status, int suppliersId, int recordLabel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.margin = margin;
        this.status = status;
        this.suppliersId = suppliersId;
        this.recordLabel = recordLabel;
    }
    
    
}
