/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.inventorymanagement.DAO.impl;

import com.prakas.inventorymanagement.DAO.ProductDAO;
import com.prakas.inventorymanagement.entity.Products;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Prakas
 */
public class ProductDAOImpl implements ProductDAO{

    @Override
    public int insert(Products t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Products> getall() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Products getbyId(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
