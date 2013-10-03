/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {
    
    Connection connection = null;
    
    public  EntidadBancariaDAO () throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","banco", "banco");
    }
    
    
    
    public EntidadBancaria read (int idEntidadBancaria) throws SQLException {
        String selectSQL = "SELECT * FROM entidadBancaria WHERE idEntidadBancaria = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        
        preparedStatement.setInt(1, idEntidadBancaria);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            
            String idEntidadBancaria1 = resultSet.getString("idEntidadBancaria");
                String codigoEntidad = resultSet.getString("codigoEntidad");
                String nombre = resultSet.getString("nombre");
                String cif = resultSet.getString("cif");
                
            if (idEntidadBancaria == resultSet.getInt("idEntidadBancaria")) {
            
                System.out.println("ID " + " CodigoEntidad " + " Nombre " + " CIF");
                System.out.println(idEntidadBancaria + "    " + codigoEntidad + "  " + nombre + "   " + cif);
            
            } else {
                return null;
            }
                     
            
        }
        
        
        return null;
    }
    
    public void insert (EntidadBancaria entidadBancaria) throws SQLException {
        String insertEntidadSQL = "INSERT INTO entidadBancaria" 
                   + "(idEntidadBancaria, codigoEntidad, nombre, cif, tipoEntidadBancaria)"
                   + "VALUES (?,?,?,?,?)";
        
        PreparedStatement preparedStatement2 = connection.prepareStatement(insertEntidadSQL);
        preparedStatement2.setInt(1, 2);
        preparedStatement2.setString(2, "002");
        preparedStatement2.setString(3, "Bankia");
        preparedStatement2.setString(4, "002");
        preparedStatement2.setString(5, "AHORROS");
        
        //ejecuta el INSERT
        preparedStatement2.executeUpdate();
    }
    
    public void update (EntidadBancaria entidadBancaria) throws SQLException {
        String updateEntidadSQL = "UPDATE entidadBancaria SET nombre = ? WHERE idEntidadBancaria = ?";
        
        PreparedStatement preparedStatement3 = connection.prepareStatement(updateEntidadSQL);
        preparedStatement3.setString(1, "Santander");
        preparedStatement3.setInt(2, 2);
        
        //actualizamos dicha tabla
        preparedStatement3.executeUpdate();
        
    }
    
    public void delete (int idEntidadBancaria) {
        
    }
    
    public List <EntidadBancaria> findAll() {
        return null;
    }
    
    public List <EntidadBancaria> findByCodigo (String codigo) {
        return null;
    }
}
