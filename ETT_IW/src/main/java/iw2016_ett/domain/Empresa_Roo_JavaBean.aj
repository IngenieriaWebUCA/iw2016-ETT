// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Localizacion;
import java.util.Set;

privileged aspect Empresa_Roo_JavaBean {
    
    public String Empresa.getCIF() {
        return this.CIF;
    }
    
    public void Empresa.setCIF(String CIF) {
        this.CIF = CIF;
    }
    
    public String Empresa.getNombre() {
        return this.nombre;
    }
    
    public void Empresa.setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String Empresa.getActividad() {
        return this.actividad;
    }
    
    public void Empresa.setActividad(String actividad) {
        this.actividad = actividad;
    }
    
    public int Empresa.getN_Empleados() {
        return this.n_Empleados;
    }
    
    public void Empresa.setN_Empleados(int n_Empleados) {
        this.n_Empleados = n_Empleados;
    }
    
    public String Empresa.getEmail() {
        return this.email;
    }
    
    public void Empresa.setEmail(String email) {
        this.email = email;
    }
    
    public Set<Localizacion> Empresa.getLocalizacion() {
        return this.localizacion;
    }
    
    public void Empresa.setLocalizacion(Set<Localizacion> localizacion) {
        this.localizacion = localizacion;
    }
    
}
