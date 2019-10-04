package com.eiv;

import java.math.BigDecimal;

public class LocalidadRepository {
    
    private BigDecimal idPais;
    private BigDecimal idProvincia;
    private BigDecimal codPostal;
    private String descripcion;
    private BigDecimal prefijo;
    
    public BigDecimal getIdPais() {
        return idPais;
    }
    
    public void setIdPais(BigDecimal idPais) {
        this.idPais = idPais;
    }
    
    public BigDecimal getIdProvincia() {
        return idProvincia;
    }
    
    public void setIdProvincia(BigDecimal idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    public BigDecimal getCodPostal() {
        return codPostal;
    }
    
    public void setCodPostal(BigDecimal codPostal) {
        this.codPostal = codPostal;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public BigDecimal getPrefijo() {
        return prefijo;
    }
    
    public void setPrefijo(BigDecimal prefijo) {
        this.prefijo = prefijo;
    }
    

}
