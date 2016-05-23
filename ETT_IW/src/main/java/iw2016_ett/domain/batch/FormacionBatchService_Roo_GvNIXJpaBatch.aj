// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain.batch;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.impl.JPADeleteClause;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.PathBuilder;
import iw2016_ett.domain.Formacion;
import iw2016_ett.domain.batch.FormacionBatchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

privileged aspect FormacionBatchService_Roo_GvNIXJpaBatch {
    
    public Class FormacionBatchService.getEntity() {
        return Formacion.class;
    }
    
    public EntityManager FormacionBatchService.entityManager() {
        return Formacion.entityManager();
    }
    
    @Transactional
    public int FormacionBatchService.deleteAll() {
        return entityManager().createQuery("DELETE FROM Formacion").executeUpdate();
    }
    
    @Transactional
    public int FormacionBatchService.deleteIn(List<Long> ids) {
        Query query = entityManager().createQuery("DELETE FROM Formacion as f WHERE f.id IN (:idList)");
        query.setParameter("idList", ids);
        return query.executeUpdate();
    }
    
    @Transactional
    public int FormacionBatchService.deleteNotIn(List<Long> ids) {
        Query query = entityManager().createQuery("DELETE FROM Formacion as f WHERE f.id NOT IN (:idList)");
        query.setParameter("idList", ids);
        return query.executeUpdate();
    }
    
    @Transactional
    public void FormacionBatchService.create(List<Formacion> formacions) {
        for( Formacion formacion : formacions) {
            formacion.persist();
        }
    }
    
    @Transactional
    public List<Formacion> FormacionBatchService.update(List<Formacion> formacions) {
        List<Formacion> merged = new ArrayList<Formacion>();
        for( Formacion formacion : formacions) {
            merged.add( formacion.merge() );
        }
        return merged;
    }
    
    public List<Formacion> FormacionBatchService.findByValues(Map<String, Object> propertyValues) {
        
        // if there is a filter
        if (propertyValues != null && !propertyValues.isEmpty()) {
            // Prepare a predicate
            BooleanBuilder baseFilterPredicate = new BooleanBuilder();
            
            // Base filter. Using BooleanBuilder, a cascading builder for
            // Predicate expressions
            PathBuilder<Formacion> entity = new PathBuilder<Formacion>(Formacion.class, "entity");
            
            // Build base filter
            for (String key : propertyValues.keySet()) {
                baseFilterPredicate.and(entity.get(key).eq(propertyValues.get(key)));
            }
            
            // Create a query with filter
            JPAQuery query = new JPAQuery(Formacion.entityManager());
            query = query.from(entity);
            
            // execute query
            return query.where(baseFilterPredicate).list(entity);
        }
        
        // no filter: return all elements
        return Formacion.findAllFormacions();
    }
    
    @Transactional
    public long FormacionBatchService.deleteByValues(Map<String, Object> propertyValues) {
        
        // if there no is a filter
        if (propertyValues == null || propertyValues.isEmpty()) {
            throw new IllegalArgumentException("Missing property values");
        }
        // Prepare a predicate
        BooleanBuilder baseFilterPredicate = new BooleanBuilder();
        
        // Base filter. Using BooleanBuilder, a cascading builder for
        // Predicate expressions
        PathBuilder<Formacion> entity = new PathBuilder<Formacion>(Formacion.class, "entity");
        
        // Build base filter
        for (String key : propertyValues.keySet()) {
            baseFilterPredicate.and(entity.get(key).eq(propertyValues.get(key)));
        }
        
        // Create a query with filter
        JPADeleteClause delete = new JPADeleteClause(Formacion.entityManager(),entity);
        
        // execute delete
        return delete.where(baseFilterPredicate).execute();
    }
    
    @Transactional
    public void FormacionBatchService.delete(List<Formacion> formacions) {
        for( Formacion formacion : formacions) {
            formacion.remove();
        }
    }
    
}
