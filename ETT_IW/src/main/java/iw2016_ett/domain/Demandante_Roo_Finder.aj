// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.ExperienciaLaboral;
import iw2016_ett.domain.Formacion;
import iw2016_ett.domain.PuestoTrabajo;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Demandante_Roo_Finder {
    
    public static Long Demandante.countFindDemandantesByExperiencia(Set<ExperienciaLaboral> experiencia) {
        if (experiencia == null) throw new IllegalArgumentException("The experiencia argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT COUNT(o) FROM Demandante AS o WHERE");
        for (int i = 0; i < experiencia.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :experiencia_item").append(i).append(" MEMBER OF o.experiencia");
        }
        TypedQuery q = em.createQuery(queryBuilder.toString(), Long.class);
        int experienciaIndex = 0;
        for (ExperienciaLaboral _experiencialaboral: experiencia) {
            q.setParameter("experiencia_item" + experienciaIndex++, _experiencialaboral);
        }
        return ((Long) q.getSingleResult());
    }
    
    public static Long Demandante.countFindDemandantesByFormacion(Set<Formacion> formacion) {
        if (formacion == null) throw new IllegalArgumentException("The formacion argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT COUNT(o) FROM Demandante AS o WHERE");
        for (int i = 0; i < formacion.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :formacion_item").append(i).append(" MEMBER OF o.formacion");
        }
        TypedQuery q = em.createQuery(queryBuilder.toString(), Long.class);
        int formacionIndex = 0;
        for (Formacion _formacion: formacion) {
            q.setParameter("formacion_item" + formacionIndex++, _formacion);
        }
        return ((Long) q.getSingleResult());
    }
    
    public static Long Demandante.countFindDemandantesByPuestosInteresa(Set<PuestoTrabajo> puestosInteresa) {
        if (puestosInteresa == null) throw new IllegalArgumentException("The puestosInteresa argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT COUNT(o) FROM Demandante AS o WHERE");
        for (int i = 0; i < puestosInteresa.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :puestosInteresa_item").append(i).append(" MEMBER OF o.puestosInteresa");
        }
        TypedQuery q = em.createQuery(queryBuilder.toString(), Long.class);
        int puestosInteresaIndex = 0;
        for (PuestoTrabajo _puestotrabajo: puestosInteresa) {
            q.setParameter("puestosInteresa_item" + puestosInteresaIndex++, _puestotrabajo);
        }
        return ((Long) q.getSingleResult());
    }
    
    public static Long Demandante.countFindDemandantesByUsernameEquals(String username) {
        if (username == null || username.length() == 0) throw new IllegalArgumentException("The username argument is required");
        EntityManager em = Demandante.entityManager();
        TypedQuery q = em.createQuery("SELECT COUNT(o) FROM Demandante AS o WHERE o.username = :username", Long.class);
        q.setParameter("username", username);
        return ((Long) q.getSingleResult());
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByExperiencia(Set<ExperienciaLaboral> experiencia) {
        if (experiencia == null) throw new IllegalArgumentException("The experiencia argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < experiencia.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :experiencia_item").append(i).append(" MEMBER OF o.experiencia");
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int experienciaIndex = 0;
        for (ExperienciaLaboral _experiencialaboral: experiencia) {
            q.setParameter("experiencia_item" + experienciaIndex++, _experiencialaboral);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByExperiencia(Set<ExperienciaLaboral> experiencia, String sortFieldName, String sortOrder) {
        if (experiencia == null) throw new IllegalArgumentException("The experiencia argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < experiencia.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :experiencia_item").append(i).append(" MEMBER OF o.experiencia");
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" " + sortOrder);
            }
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int experienciaIndex = 0;
        for (ExperienciaLaboral _experiencialaboral: experiencia) {
            q.setParameter("experiencia_item" + experienciaIndex++, _experiencialaboral);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByFormacion(Set<Formacion> formacion) {
        if (formacion == null) throw new IllegalArgumentException("The formacion argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < formacion.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :formacion_item").append(i).append(" MEMBER OF o.formacion");
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int formacionIndex = 0;
        for (Formacion _formacion: formacion) {
            q.setParameter("formacion_item" + formacionIndex++, _formacion);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByFormacion(Set<Formacion> formacion, String sortFieldName, String sortOrder) {
        if (formacion == null) throw new IllegalArgumentException("The formacion argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < formacion.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :formacion_item").append(i).append(" MEMBER OF o.formacion");
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" " + sortOrder);
            }
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int formacionIndex = 0;
        for (Formacion _formacion: formacion) {
            q.setParameter("formacion_item" + formacionIndex++, _formacion);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByPuestosInteresa(Set<PuestoTrabajo> puestosInteresa) {
        if (puestosInteresa == null) throw new IllegalArgumentException("The puestosInteresa argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < puestosInteresa.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :puestosInteresa_item").append(i).append(" MEMBER OF o.puestosInteresa");
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int puestosInteresaIndex = 0;
        for (PuestoTrabajo _puestotrabajo: puestosInteresa) {
            q.setParameter("puestosInteresa_item" + puestosInteresaIndex++, _puestotrabajo);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByPuestosInteresa(Set<PuestoTrabajo> puestosInteresa, String sortFieldName, String sortOrder) {
        if (puestosInteresa == null) throw new IllegalArgumentException("The puestosInteresa argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE");
        for (int i = 0; i < puestosInteresa.size(); i++) {
            if (i > 0) queryBuilder.append(" AND");
            queryBuilder.append(" :puestosInteresa_item").append(i).append(" MEMBER OF o.puestosInteresa");
        }
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" " + sortOrder);
            }
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        int puestosInteresaIndex = 0;
        for (PuestoTrabajo _puestotrabajo: puestosInteresa) {
            q.setParameter("puestosInteresa_item" + puestosInteresaIndex++, _puestotrabajo);
        }
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByUsernameEquals(String username) {
        if (username == null || username.length() == 0) throw new IllegalArgumentException("The username argument is required");
        EntityManager em = Demandante.entityManager();
        TypedQuery<Demandante> q = em.createQuery("SELECT o FROM Demandante AS o WHERE o.username = :username", Demandante.class);
        q.setParameter("username", username);
        return q;
    }
    
    public static TypedQuery<Demandante> Demandante.findDemandantesByUsernameEquals(String username, String sortFieldName, String sortOrder) {
        if (username == null || username.length() == 0) throw new IllegalArgumentException("The username argument is required");
        EntityManager em = Demandante.entityManager();
        StringBuilder queryBuilder = new StringBuilder("SELECT o FROM Demandante AS o WHERE o.username = :username");
        if (fieldNames4OrderClauseFilter.contains(sortFieldName)) {
            queryBuilder.append(" ORDER BY ").append(sortFieldName);
            if ("ASC".equalsIgnoreCase(sortOrder) || "DESC".equalsIgnoreCase(sortOrder)) {
                queryBuilder.append(" ").append(sortOrder);
            }
        }
        TypedQuery<Demandante> q = em.createQuery(queryBuilder.toString(), Demandante.class);
        q.setParameter("username", username);
        return q;
    }
    
}
