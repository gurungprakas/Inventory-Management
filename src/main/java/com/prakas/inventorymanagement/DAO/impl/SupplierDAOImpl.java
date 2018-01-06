/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.inventorymanagement.DAO.impl;

import com.prakas.inventorymanagement.DAO.SupplierDAO;
import com.prakas.inventorymanagement.connection.DbConnection;
import com.prakas.inventorymanagement.constant.SqlConstant;
import com.prakas.inventorymanagement.entity.Suppliers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prakas
 */
 public class SupplierDAOImpl implements SupplierDAO{
    private DbConnection db=new DbConnection();

    @Override
    public int insert(Suppliers supp) throws ClassNotFoundException, SQLException {
       db.connect();
        PreparedStatement stmt=db.initStatement(SqlConstant.SUPPLIER_INSERT);
        stmt.setString(1, supp.getName());
        stmt.setString(2,supp.getEmail());  
        stmt.setInt(3,supp.getContactNo());
        int result=db.update();
        db.close();
        return result;
        
    }

    @Override
    public List<Suppliers> getall() throws ClassNotFoundException, SQLException {
        List<Suppliers> suppList=new ArrayList<>();
        db.connect();
        db.initStatement(SqlConstant.SUPPLIER_GETALL);
        ResultSet rs=db.query();
        while(rs.next()){
            Suppliers supp=new Suppliers();
            supp.setId(rs.getInt("id"));
            supp.setName(rs.getString("name"));
            supp.setEmail(rs.getString("email"));
            supp.setContactNo(rs.getInt("contact_no"));
            suppList.add(supp);
        }
        db.close();
        return suppList;
        
    }

    @Override
    public Suppliers getbyId(int id) throws ClassNotFoundException, SQLException {
        db.connect();
        Suppliers supp=null;
        db.initStatement(SqlConstant.SUPPLIER_GETBYID);
        ResultSet rs=db.query();
        while(rs.next()){
            supp=new Suppliers();
            supp.setId(rs.getInt("id"));
            supp.setName(rs.getString("name"));
            supp.setEmail(rs.getString("email"));
            supp.setContactNo(rs.getInt("contact_no"));
            
        }
        db.close();
        return supp;
        
    }
    
    
}
