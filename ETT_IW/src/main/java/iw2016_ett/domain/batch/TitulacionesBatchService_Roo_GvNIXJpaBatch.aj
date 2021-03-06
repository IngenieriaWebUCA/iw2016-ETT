// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain.batch;

import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.impl.JPADeleteClause;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.path.PathBuilder;
import iw2016_ett.domain.Titulaciones;
import iw2016_ett.domain.batch.TitulacionesBatchService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.transaction.annotation.Transactional;

privileged aspect TitulacionesBatchService_Roo_GvNIXJpaBatch {
    
    public Class TitulacionesBatchService.getEntity() {
        return Titulaciones.class;
    }
    
    public EntityManager TitulacionesBatchService.entityManager() {
        return Titulaciones.entityManager();
    }
    
    @Transactional
    public int TitulacionesBatchService.deleteAll() {
        return entityManager().createQuery("DELETE FROM Titulaciones").executeUpdate();
    }
    
    @Transactional
    public int TitulacionesBatchService.deleteIn(List<Long> ids) {
        Query query = entityManager().createQuery("DELETE FROM Titulaciones as t WHERE t.id IN (:idList)");
        query.setParameter("idList", ids);
        return query.executeUpdate();
    }
    
    @Transactional
    public int TitulacionesBatchService.deleteNotIn(List<Long> ids) {
        Query query = entityManager().createQuery("DELETE FROM Titulaciones as t WHERE t.id NOT IN (:idList)");
        query.setParameter("idList", ids);
        return query.executeUpdate();
    }
    
    @Transactional
    public void TitulacionesBatchService.create(List<Titulaciones> titulacioneses) {
        for( Titulaciones titulaciones : titulacioneses) {
            titulaciones.persist();
        }
    }
    
    @Transactional
    public List<Titulaciones> TitulacionesBatchService.update(List<Titulaciones> titulacioneses) {
        List<Titulaciones> merged = new ArrayList<Titulaciones>();
        for( Titulaciones titulaciones : titulacioneses) {
            merged.add( titulaciones.merge() );
        }
        return merged;
    }
    
    public List<Titulaciones> TitulacionesBatchService.findByValues(Map<String, Object> propertyValues) {
        
        // if there is a filter
        if (propertyValues != null && !propertyValues.isEmpty()) {
            // Prepare a predicate
            BooleanBuilder baseFilterPredicate = new BooleanBuilder();
            
            // Base filter. Using BooleanBuilder, a cascading builder for
            // Predicate expressions
            PathBuilder<Titulaciones> entity = new PathBuilder<Titulaciones>(Titulaciones.class, "entity");
            
            // Build base filter
            for (String key : propertyValues.keySet()) {
                baseFilterPredicate.and(entity.get(key).eq(propertyValues.get(key)));
            }
            
            // Create a query with filter
            JPAQuery query = new JPAQuery(Titulaciones.entityManager());
            query = query.from(entity);
            
            // execute query
            return query.where(baseFilterPredicate).list(entity);
        }
        
        // no filter: return all elements
        return Titulaciones.findAllTitulacioneses();
    }
    
    @Transactional
    public long TitulacionesBatchService.deleteByValues(Map<String, Object> propertyValues) {
        
        // if there no is a filter
        if (propertyValues == null || propertyValues.isEmpty()) {
            throw new IllegalArgumentException("Missing property values");
        }
        // Prepare a predicate
        BooleanBuilder baseFilterPredicate = new BooleanBuilder();
        
        // Base filter. Using BooleanBuilder, a cascading builder for
        // Predicate expressions
        PathBuilder<Titulaciones> entity = new PathBuilder<Titulaciones>(Titulaciones.class, "entity");
        
        // Build base filter
        for (String key : propertyValues.keySet()) {
            baseFilterPredicate.and(entity.get(key).eq(propertyValues.get(key)));
        }
        
        // Create a query with filter
        JPADeleteClause delete = new JPADeleteClause(Titulaciones.entityManager(),entity);
        
        // execute delete
        return delete.where(baseFilterPredicate).execute();
    }
    
    @Transactional
    public void TitulacionesBatchService.delete(List<Titulaciones> titulacioneses) {
        for( Titulaciones titulaciones : titulacioneses) {
            titulaciones.remove();
        }
    }
    
}
