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
        EntidadBancaria entidadBancaria = new EntidadBancaria(4, "2002", "Santander", "003", TipoEntidadBancaria.COOPERATIVASCREDITO);
        

        entidadBancariaDAO.read(3);

        entidadBancariaDAO.insert(entidadBancaria);
        entidadBancariaDAO.read(2);
        

    }
}
