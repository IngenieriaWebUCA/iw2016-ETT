// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.Estado;
import iw2016_ett.domain.Localizacion;
import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.PuestoTrabajo;
import iw2016_ett.domain.Titulaciones;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Oferta_Roo_Finder {
    
    public static Long Oferta.countFindOfertasByEmpresa(Empresa empresa) {
        if (empresa == null) throw new IllegalArgumentException("The empresa argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.empresa = :empresa", Long.class);
        q.setParameter("empresa", empresa);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Oferta.countFindOfertasByEstado(Estado Estado) {
        if (Estado == null) throw new IllegalArgumentException("The Estado argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.Estado = :Estado", Long.class);
        q.setParameter("Estado", Estado);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Oferta.countFindOfertasByLocalizacion(Localizacion localizacion) {
        if (localizacion == null) throw new IllegalArgumentException("The localizacion argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.localizacion = :localizacion", Long.class);
        q.setParameter("localizacion", localizacion);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Oferta.countFindOfertasByPuestotrabajo(PuestoTrabajo puestotrabajo) {
        if (puestotrabajo == null) throw new IllegalArgumentException("The puestotrabajo argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.puestotrabajo = :puestotrabajo", Long.class);
        q.setParameter("puestotrabajo", puestotrabajo);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Oferta.countFindOfertasByTitulaciones(Set<Titulaciones> titulaciones) {
        if (titulaciones == null) throw new IllegalArgumentException("The titulaciones argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT COUNT(o) FROM Oferta AS o WHERE");
        for (int i = 0; i < titulaciones.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :titulaciones_item").append(i).append(" MEMBER OF o.titulaciones");
        }
        TypedQuery q = em.createQuery(queryBuilder.toString(), Long.class);
        int titulacionesIndex = 0;
        for (Titulaciones _titulaciones: titulaciones) {
            q.setParameter("titulaciones_item" + titulacionesIndex++, _titulaciones);
        }
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByEmpresa(Empresa empresa) {
        if (empresa == null) throw new IllegalArgumentException("The empresa argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery<Oferta> q = em.createQuery("SELECT o FROM Oferta AS o WHERE o.empresa = :empresa", Oferta.class);
        q.setParameter("empresa", empresa);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByEmpresa(Empresa empresa, String sortFieldName, String sortOrder) {
        if (empresa == null) throw new IllegalArgumentException("The empresa argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE o.empresa = :empresa");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        q.setParameter("empresa", empresa);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByEstado(Estado Estado) {
        if (Estado == null) throw new IllegalArgumentException("The Estado argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery<Oferta> q = em.createQuery("SELECT o FROM Oferta AS o WHERE o.Estado = :Estado", Oferta.class);
        q.setParameter("Estado", Estado);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByEstado(Estado Estado, String sortFieldName, String sortOrder) {
        if (Estado == null) throw new IllegalArgumentException("The Estado argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE o.Estado = :Estado");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        q.setParameter("Estado", Estado);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByLocalizacion(Localizacion localizacion) {
        if (localizacion == null) throw new IllegalArgumentException("The localizacion argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery<Oferta> q = em.createQuery("SELECT o FROM Oferta AS o WHERE o.localizacion = :localizacion", Oferta.class);
        q.setParameter("localizacion", localizacion);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByLocalizacion(Localizacion localizacion, String sortFieldName, String sortOrder) {
        if (localizacion == null) throw new IllegalArgumentException("The localizacion argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE o.localizacion = :localizacion");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        q.setParameter("localizacion", localizacion);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByPuestotrabajo(PuestoTrabajo puestotrabajo) {
        if (puestotrabajo == null) throw new IllegalArgumentException("The puestotrabajo argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery<Oferta> q = em.createQuery("SELECT o FROM Oferta AS o WHERE o.puestotrabajo = :puestotrabajo", Oferta.class);
        q.setParameter("puestotrabajo", puestotrabajo);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByPuestotrabajo(PuestoTrabajo puestotrabajo, String sortFieldName, String sortOrder) {
        if (puestotrabajo == null) throw new IllegalArgumentException("The puestotrabajo argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE o.puestotrabajo = :puestotrabajo");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        q.setParameter("puestotrabajo", puestotrabajo);
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByTitulaciones(Set<Titulaciones> titulaciones) {
        if (titulaciones == null) throw new IllegalArgumentException("The titulaciones argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE");
        for (int i = 0; i < titulaciones.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :titulaciones_item").append(i).append(" MEMBER OF o.titulaciones");
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        int titulacionesIndex = 0;
        for (Titulaciones _titulaciones: titulaciones) {
            q.setParameter("titulaciones_item" + titulacionesIndex++, _titulaciones);
        }
        return q;
    }
    
    public static TypedQuery<Oferta> Oferta.findOfertasByTitulaciones(Set<Titulaciones> titulaciones, String sortFieldName, String sortOrder) {
        if (titulaciones == null) throw new IllegalArgumentException("The titulaciones argument is required");
        EntityManager em = Oferta.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Oferta AS o WHERE");
        for (int i = 0; i < titulaciones.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :titulaciones_item").append(i).append(" MEMBER OF o.titulaciones");
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" " + sortOrder);
            }
        }
        TypedQuery<Oferta> q = em.createQuery(queryBuilder.toString(), Oferta.class);
        int titulacionesIndex = 0;
        for (Titulaciones _titulaciones: titulaciones) {
            q.setParameter("titulaciones_item" + titulacionesIndex++, _titulaciones);
        }
        return q;
    }
    
}
