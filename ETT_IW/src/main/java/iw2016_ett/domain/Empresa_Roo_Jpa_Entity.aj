// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Empresa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Empresa_Roo_Jpa_Entity {
    
    declare @type: Empresa: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Empresa.id;
    
    @Version
    @Column(name = "version")
    private Integer Empresa.version;
    
    public Long Empresa.getId() {
        return this.id;
    }
    
    public void Empresa.setId(Long id) {
        this.id = id;
    }
    
    public Integer Empresa.getVersion() {
        return this.version;
    }
    
    public void Empresa.setVersion(Integer version) {
        this.version = version;
    }
    
}
