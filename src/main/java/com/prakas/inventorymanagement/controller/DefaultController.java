/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.inventorymanagement.controller;

import com.prakas.inventorymanagement.DAO.SupplierDAO;
import com.prakas.inventorymanagement.DAO.impl.SupplierDAOImpl;
import com.prakas.inventorymanagement.entity.Suppliers;
import com.prakas.inventorymanagement.system.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prakas
 */
@WebServlet(name="default",urlPatterns = {"/"})
public class DefaultController extends Controller{
    private SupplierDAO suppDAO= new SupplierDAOImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try{
        PrintWriter out=response.getWriter();
        response.getWriter().println(suppDAO.getbyId(1).getName());
       
       
        } catch (ClassNotFoundException|SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}

