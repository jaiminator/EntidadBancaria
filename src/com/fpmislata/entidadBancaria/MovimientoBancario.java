/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {
    private int idMovimientoBancario;
    private CuentaBancaria cuentaBancaria;
    private TipoMovimientoBancario tipoMovimientoBancario;
    private BigDecimal importe;
    private Date fecha;
    private BigDecimal saldoTotal;
    private String concepto;
    

    public MovimientoBancario(int idMovimiento, CuentaBancaria cuentaBancaria, TipoMovimientoBancario tipoMovimientoBancario, BigDecimal importe, Date fecha, BigDecimal saldoTotal, String concepto) {
        this.idMovimientoBancario = idMovimiento;
        this.cuentaBancaria = cuentaBancaria;
        this.tipoMovimientoBancario = tipoMovimientoBancario;
        this.importe = importe;
        this.fecha = fecha;
        this.saldoTotal = saldoTotal;
        this.concepto = concepto;
    }

    public int getIdMovimiento() {
        return idMovimientoBancario;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimientoBancario = idMovimiento;
    }

    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public TipoMovimientoBancario getTipoMovimientoBancario() {
        return tipoMovimientoBancario;
    }

    public void setTipoMovimientoBancario(TipoMovimientoBancario tipoMovimientoBancario) {
        this.tipoMovimientoBancario = tipoMovimientoBancario;
    }

    public BigDecimal getImporte() {
        return importe;
    }

    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    
    
}
