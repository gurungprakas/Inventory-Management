 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.inventorymanagement.constant;

/**
 *
 * @author Prakas
 */
public class SqlConstant {
    public final static  String SUPPLIER_INSERT="INSERT INTO tbl_suppliers(name,email,contact_no) values (?,?,?)";
    public final static String SUPPLIER_GETALL="SELECT * FROM tbl_suppliers";
    public final static String SUPPLIER_GETBYID="SELECT * FROM tbl_supppliers where id=?";
   
    //public final static  String PRODUCT_INSERT="INSERT INTO tbl_products(name,description,quantity,price,margin,status,record_level) values(?,?,?,?,?,?,?)";
    //public final static String PRODUCT_GETALL="SELECT * FROM tbl_products";
     //public final static String PRODUCT_GETBYID="SELECT * FROM tbl_products where product_id=?";
    
}
