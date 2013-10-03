/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.sql.SQLException;
import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        EntidadBancariaDAO entidadBancariaDAO = null;
        
        entidadBancariaDAO.read(1);
    }
}
