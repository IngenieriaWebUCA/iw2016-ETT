// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Estado;
import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.PuestoTrabajo;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Oferta_Roo_Finder {
    
    public static Long Oferta.countFindOfertasByEstado(Estado Estado) {
        if (Estado == null) throw new IllegalArgumentException("The Estado argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.Estado = :Estado", Long.class);
        q.setParameter("Estado", Estado);
        return ((Long) q.getSingleResult());
    }
    
    public static Long Oferta.countFindOfertasByPuestotrabajo(PuestoTrabajo puestotrabajo) {
        if (puestotrabajo == null) throw new IllegalArgumentException("The puestotrabajo argument is required");
        EntityManager em = Oferta.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Oferta AS o WHERE o.puestotrabajo = :puestotrabajo", Long.class);
        q.setParameter("puestotrabajo", puestotrabajo);
        return ((Long) q.getSingleResult());
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
    
}
