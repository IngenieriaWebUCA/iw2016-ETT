// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Comunidad;
import iw2016_ett.domain.Localidad;
import iw2016_ett.domain.Localizacion;
import iw2016_ett.domain.Pais;
import iw2016_ett.domain.Provincia;

privileged aspect Localizacion_Roo_JavaBean {
    
    public Pais Localizacion.getPais() {
        return this.Pais;
    }
    
    public void Localizacion.setPais(Pais Pais) {
        this.Pais = Pais;
    }
    
    public Comunidad Localizacion.getComunidad() {
        return this.comunidad;
    }
    
    public void Localizacion.setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }
    
    public Provincia Localizacion.getProvincia() {
        return this.Provincia;
    }
    
    public void Localizacion.setProvincia(Provincia Provincia) {
        this.Provincia = Provincia;
    }
    
    public Localidad Localizacion.getLocalidad() {
        return this.Localidad;
    }
    
    public void Localizacion.setLocalidad(Localidad Localidad) {
        this.Localidad = Localidad;
    }
    
    public String Localizacion.getDireccion() {
        return this.direccion;
    }
    
    public void Localizacion.setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
