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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAO {
    
    Connection connection = null;
    
    public  EntidadBancariaDAO() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco","banco", "banco");
    }
    
    
    
    public EntidadBancaria read (int idEntidadBancaria) throws SQLException {
        

        String selectSQL = "SELECT * FROM entidadBancaria WHERE idEntidadBancaria = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);


        preparedStatement.setInt(1, idEntidadBancaria);
        ResultSet resultSet = preparedStatement.executeQuery();

        EntidadBancaria entidadBancaria = new EntidadBancaria();
            

        while (resultSet.next()) {
            
            String idEntidadBancaria1 = resultSet.getString("idEntidadBancaria");
            String codigoEntidad = resultSet.getString("codigoEntidad");
            String nombre = resultSet.getString("nombre");
            String cif = resultSet.getString("cif");
            String tipoEntidadBancaria = resultSet.getString("tipoEntidadBancaria");
            
            System.out.println("ID " + " CodigoEntidad " + " Nombre " + "     CIF " + " TipoEntidadBancaria");
            System.out.println(idEntidadBancaria1 + "    " + codigoEntidad + "           " + nombre + "     " + cif + "         " + tipoEntidadBancaria);
        } 
           
        return entidadBancaria;
    }
    
    public void insert (EntidadBancaria entidadBancaria) throws SQLException {
        String insertEntidadSQL = "INSERT INTO entidadBancaria" 
                   + "(idEntidadBancaria, codigoEntidad, nombre, cif, tipoEntidadBancaria)"
                   + "VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement preparedStatement = connection.prepareStatement(insertEntidadSQL);
        preparedStatement.setInt(1, entidadBancaria.getIdEntidad());
        preparedStatement.setString(2, entidadBancaria.getCodigoEntidad());
        preparedStatement.setString(3, entidadBancaria.getNombre());
        preparedStatement.setString(4, entidadBancaria.getCif());
        preparedStatement.setString(5, entidadBancaria.getTipoEntidad().name());
        
        //ejecuta el INSERT
        preparedStatement.executeUpdate(insertEntidadSQL);
    }
    
    public void update (EntidadBancaria entidadBancaria) throws SQLException {
        String updateEntidadSQL = "UPDATE entidadBancaria SET nombre = ? WHERE idEntidadBancaria = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(updateEntidadSQL);
        preparedStatement.setInt(2, entidadBancaria.getIdEntidad());
        preparedStatement.setString(1, entidadBancaria.getNombre());
        
        
        //actualizamos dicha tabla
        preparedStatement.executeUpdate();
        
    }
    
    public void delete (int idEntidadBancaria) throws SQLException {
        String deleteTableSQL = "DELETE FROM entidadBancaria WHERE idEntidadBancaria = ?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(deleteTableSQL);
        preparedStatement.setInt(1, 2);
        
        //borramos dicha tabla
        preparedStatement.executeUpdate();
    }
    
    public List <EntidadBancaria> findAll() throws SQLException {
        
        List <EntidadBancaria> entidadesBancarias = new ArrayList<>();
        
        String selectSQL = "SELECT * FROM entidadBancaria";
        
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            
            String idEntidadBancaria1 = resultSet.getString("idEntidadBancaria");
            String codigoEntidad = resultSet.getString("codigoEntidad");
            String nombre = resultSet.getString("nombre");
            String cif = resultSet.getString("cif");
            String tipoEntidadBancaria = resultSet.getString("tipoEntidadBancaria");
            
            EntidadBancaria entidadBancaria = new EntidadBancaria(3, "003", "Santanter", "003", TipoEntidadBancaria.CAJAAHORROS);
            entidadesBancarias.add(entidadBancaria);
        } 
        
        
        return entidadesBancarias;
    }
    
    public List <EntidadBancaria> findByCodigo (String codigo) {
        return null;
    }
}
