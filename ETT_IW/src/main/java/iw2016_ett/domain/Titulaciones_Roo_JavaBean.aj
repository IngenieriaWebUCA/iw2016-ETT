// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.Titulaciones;

privileged aspect Titulaciones_Roo_JavaBean {
    
    public String Titulaciones.getNombre() {
        return this.Nombre;
    }
    
    public void Titulaciones.setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Oferta Titulaciones.getOferta() {
        return this.oferta;
    }
    
    public void Titulaciones.setOferta(Oferta oferta) {
        this.oferta = oferta;
    }
    
}
