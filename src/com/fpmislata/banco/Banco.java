/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de listas
        List <CuentaBancaria> cuentasBancarias = new ArrayList<>();
        List <SucursalBancaria> sucursalesBancarias = new ArrayList<>();
        List <EntidadBancaria> entidadesBancarias = new ArrayList<>();
        
        //Declaracion de BigDecimal de la cuentas bancarias
         BigDecimal bigDecimal1 = new BigDecimal("4500.00");
         BigDecimal bigDecimal2 = new BigDecimal("6750.00");
         
         //Declaracion de BigDecimal para movimientos bancarios de la cuenta: cuentaBancaria1
         BigDecimal bigDecimal3 = new BigDecimal("300.00");
         BigDecimal bigDecimal4 = new BigDecimal("4200.00");
         BigDecimal bigDecimal5 = new BigDecimal("400.00");
         BigDecimal bigDecimal6 = new BigDecimal("4900.00");
         
         //Declaracion de BigDecimal para movimientos bancarios de la cuenta: cuentaBancaria2
         BigDecimal bigDecimal7 = new BigDecimal("600.00");
         BigDecimal bigDecimal8 = new BigDecimal("6150.00");
         BigDecimal bigDecimal9 = new BigDecimal("1000.00");
         BigDecimal bigDecimal10 = new BigDecimal("5150.00"); 
        
        //Declaracion nuevas entidades
         EntidadBancaria entidadBancaria1 = new EntidadBancaria(123, "3423", "jlg1", "tr45", TipoEntidadBancaria.BANCO);
         EntidadBancaria entidadBancaria2 = new EntidadBancaria(456, "9800", "rhb3", "tr70", TipoEntidadBancaria.BANCO);
         
         //Declaracion nuevas sucursales
         SucursalBancaria sucursalBancaria1 = new SucursalBancaria(1, entidadBancaria1, "0001", "Bancaixa");
         SucursalBancaria sucursalBancaria2 = new SucursalBancaria(2, entidadBancaria2, "0002", "Bancaixa");
         
         //Declaracion de cuantas bancarias
         CuentaBancaria cuentaBancaria1 = new CuentaBancaria(909, sucursalBancaria1, "0123", "033", bigDecimal1, "tr77");
         CuentaBancaria cuentaBancaria2 = new CuentaBancaria(808, sucursalBancaria2, "0543", "016", bigDecimal2, "tr24");
         
         //Declaracion movimientos bancarios
         MovimientoBancario movimientoBancario1 = new MovimientoBancario(1, cuentaBancaria1, TipoMovimientoBancario.DEBE, bigDecimal3, new GregorianCalendar(2012,06,17).getTime(), bigDecimal4, "Tranferencia bancaria");
         MovimientoBancario movimientoBancario2 = new MovimientoBancario(2, cuentaBancaria1, TipoMovimientoBancario.HABER, bigDecimal5, new GregorianCalendar(2012,06,17).getTime(), bigDecimal6, "Sacada de dinero");
         MovimientoBancario movimientoBancario3 = new MovimientoBancario(3, cuentaBancaria2, TipoMovimientoBancario.DEBE, bigDecimal7, new GregorianCalendar(2012,07,14).getTime(), bigDecimal8, "Ingreso de dinero");
         MovimientoBancario movimientoBancario4 = new MovimientoBancario(4, cuentaBancaria2, TipoMovimientoBancario.DEBE, bigDecimal9, new GregorianCalendar(2012,07,14).getTime(), bigDecimal10, "Tranferencia bancaria");
         
         
    }
}
