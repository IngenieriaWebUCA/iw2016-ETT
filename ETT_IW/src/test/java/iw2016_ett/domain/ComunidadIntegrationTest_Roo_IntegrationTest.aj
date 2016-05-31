// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Comunidad;
import iw2016_ett.domain.ComunidadDataOnDemand;
import iw2016_ett.domain.ComunidadIntegrationTest;
import java.util.Iterator;
import java.util.List;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect ComunidadIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ComunidadIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ComunidadIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: ComunidadIntegrationTest: @Transactional;
    
    @Autowired
    ComunidadDataOnDemand ComunidadIntegrationTest.dod;
    
    @Test
    public void ComunidadIntegrationTest.testCountComunidads() {
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", dod.getRandomComunidad());
        long count = Comunidad.countComunidads();
        Assert.assertTrue("Counter for 'Comunidad' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ComunidadIntegrationTest.testFindComunidad() {
        Comunidad obj = dod.getRandomComunidad();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to provide an identifier", id);
        obj = Comunidad.findComunidad(id);
        Assert.assertNotNull("Find method for 'Comunidad' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Comunidad' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ComunidadIntegrationTest.testFindAllComunidads() {
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", dod.getRandomComunidad());
        long count = Comunidad.countComunidads();
        Assert.assertTrue("Too expensive to perform a find all test for 'Comunidad', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Comunidad> result = Comunidad.findAllComunidads();
        Assert.assertNotNull("Find all method for 'Comunidad' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Comunidad' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ComunidadIntegrationTest.testFindComunidadEntries() {
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", dod.getRandomComunidad());
        long count = Comunidad.countComunidads();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Comunidad> result = Comunidad.findComunidadEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Comunidad' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Comunidad' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void ComunidadIntegrationTest.testFlush() {
        Comunidad obj = dod.getRandomComunidad();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to provide an identifier", id);
        obj = Comunidad.findComunidad(id);
        Assert.assertNotNull("Find method for 'Comunidad' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyComunidad(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Comunidad' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void ComunidadIntegrationTest.testMergeUpdate() {
        Comunidad obj = dod.getRandomComunidad();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to provide an identifier", id);
        obj = Comunidad.findComunidad(id);
        boolean modified =  dod.modifyComunidad(obj);
        Integer currentVersion = obj.getVersion();
        Comunidad merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'Comunidad' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void ComunidadIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", dod.getRandomComunidad());
        Comunidad obj = dod.getNewTransientComunidad(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Comunidad' identifier to be null", obj.getId());
        try {
            obj.persist();
        } catch (final ConstraintViolationException e) {
            final StringBuilder msg = new StringBuilder();
            for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                final ConstraintViolation<?> cv = iter.next();
                msg.append("[").append(cv.getRootBean().getClass().getName()).append(".").append(cv.getPropertyPath()).append(": ").append(cv.getMessage()).append(" (invalid value = ").append(cv.getInvalidValue()).append(")").append("]");
            }
            throw new IllegalStateException(msg.toString(), e);
        }
        obj.flush();
        Assert.assertNotNull("Expected 'Comunidad' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void ComunidadIntegrationTest.testRemove() {
        Comunidad obj = dod.getRandomComunidad();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Comunidad' failed to provide an identifier", id);
        obj = Comunidad.findComunidad(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Comunidad' with identifier '" + id + "'", Comunidad.findComunidad(id));
    }
    
}