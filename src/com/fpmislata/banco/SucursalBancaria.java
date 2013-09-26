/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class SucursalBancaria {
    private int idSucursalBancaria;
    private EntidadBancaria entidadBancaria;
    private String codigoSucursal;
    private String nombre;
    private List <CuentaBancaria> listaCuentas = new ArrayList<>();

    public SucursalBancaria(int idSucursalBancaria, EntidadBancaria entidadBancaria, String codigoSucursal, String nombre) {
        this.idSucursalBancaria = idSucursalBancaria;
        this.entidadBancaria = entidadBancaria;
        this.codigoSucursal = codigoSucursal;
        this.nombre = nombre;
    }

    public List<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    public int getIdSucursal() {
        return idSucursalBancaria;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursalBancaria = idSucursal;
    }

    public EntidadBancaria getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
