/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.entidadBancaria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {
    private int idEntidadBancaria;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    private List <SucursalBancaria> listaSucusales = new ArrayList<>();
    
    public EntidadBancaria() {
        
    }

    public EntidadBancaria(int idEntidadBancaria, String codigoEntidad, String nombre, String cif, TipoEntidadBancaria tipoEntidad) {
        this.idEntidadBancaria = idEntidadBancaria;
        this.codigoEntidad = codigoEntidad;
        this.nombre = nombre;
        this.cif = cif;
        this.tipoEntidadBancaria = tipoEntidad;
    }

    public List<SucursalBancaria> getListaSucusales() {
        return listaSucusales;
    }

    public void setListaSucusales(List<SucursalBancaria> listaSucusales) {
        this.listaSucusales = listaSucusales;
    }

    public int getIdEntidad() {
        return idEntidadBancaria;
    }

    public void setIdEntidad(int idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }

    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public TipoEntidadBancaria getTipoEntidad() {
        return tipoEntidadBancaria;
    }

    public void setTipoEntidad(TipoEntidadBancaria tipoEntidad) {
        this.tipoEntidadBancaria = tipoEntidad;
    }
    
    
}
