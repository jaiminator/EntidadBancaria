/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.presentacion;

import com.fpmislata.entidadBancaria.EntidadBancaria;
import com.fpmislata.entidadBancaria.EntidadBancariaDAO;
import com.fpmislata.entidadBancaria.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","banco", "banco");
        
        System.out.println("Se ha conectado a la base de datos");
        
        EntidadBancariaDAO entidadBancariaDAO = new EntidadBancariaDAO();
        EntidadBancaria entidadBancaria = new EntidadBancaria(3, "003", "Santander", "003", TipoEntidadBancaria.BANCO);
        
        entidadBancariaDAO.read(1);
        System.out.println("ID " + " CodigoEntidad " + " Nombre " + "     CIF " + " TipoEntidadBancaria");
        System.out.println(entidadBancaria.getIdEntidad() + "    " + entidadBancaria.getCodigoEntidad() + "           " + entidadBancaria.getNombre() + "   " + entidadBancaria.getCif() + "        " + entidadBancaria.getTipoEntidad());
        
//        entidadBancariaDAO.insert(entidadBancaria);
        
//        entidadBancariaDAO.delete(3);
        
//        entidadBancariaDAO.findAll();
        
        
        
        

    }
}
