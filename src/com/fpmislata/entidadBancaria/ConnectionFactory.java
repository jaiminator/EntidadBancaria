/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.sql.Connection;

/**
 *
 * @author alumno
 */
public interface ConnectionFactory {
    public Connection getConnection();
}
