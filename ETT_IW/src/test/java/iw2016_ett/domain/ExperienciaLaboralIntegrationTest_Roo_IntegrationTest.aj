// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.ExperienciaLaboral;
import iw2016_ett.domain.ExperienciaLaboralDataOnDemand;
import iw2016_ett.domain.ExperienciaLaboralIntegrationTest;
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

privileged aspect ExperienciaLaboralIntegrationTest_Roo_IntegrationTest {
    
    declare @type: ExperienciaLaboralIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: ExperienciaLaboralIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: ExperienciaLaboralIntegrationTest: @Transactional;
    
    @Autowired
    ExperienciaLaboralDataOnDemand ExperienciaLaboralIntegrationTest.dod;
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testCountExperienciaLaborals() {
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", dod.getRandomExperienciaLaboral());
        long count = ExperienciaLaboral.countExperienciaLaborals();
        Assert.assertTrue("Counter for 'ExperienciaLaboral' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testFindExperienciaLaboral() {
        ExperienciaLaboral obj = dod.getRandomExperienciaLaboral();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to provide an identifier", id);
        obj = ExperienciaLaboral.findExperienciaLaboral(id);
        Assert.assertNotNull("Find method for 'ExperienciaLaboral' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'ExperienciaLaboral' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testFindAllExperienciaLaborals() {
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", dod.getRandomExperienciaLaboral());
        long count = ExperienciaLaboral.countExperienciaLaborals();
        Assert.assertTrue("Too expensive to perform a find all test for 'ExperienciaLaboral', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<ExperienciaLaboral> result = ExperienciaLaboral.findAllExperienciaLaborals();
        Assert.assertNotNull("Find all method for 'ExperienciaLaboral' illegally returned null", result);
        Assert.assertTrue("Find all method for 'ExperienciaLaboral' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testFindExperienciaLaboralEntries() {
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", dod.getRandomExperienciaLaboral());
        long count = ExperienciaLaboral.countExperienciaLaborals();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<ExperienciaLaboral> result = ExperienciaLaboral.findExperienciaLaboralEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'ExperienciaLaboral' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'ExperienciaLaboral' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testFlush() {
        ExperienciaLaboral obj = dod.getRandomExperienciaLaboral();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to provide an identifier", id);
        obj = ExperienciaLaboral.findExperienciaLaboral(id);
        Assert.assertNotNull("Find method for 'ExperienciaLaboral' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyExperienciaLaboral(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'ExperienciaLaboral' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testMergeUpdate() {
        ExperienciaLaboral obj = dod.getRandomExperienciaLaboral();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to provide an identifier", id);
        obj = ExperienciaLaboral.findExperienciaLaboral(id);
        boolean modified =  dod.modifyExperienciaLaboral(obj);
        Integer currentVersion = obj.getVersion();
        ExperienciaLaboral merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'ExperienciaLaboral' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", dod.getRandomExperienciaLaboral());
        ExperienciaLaboral obj = dod.getNewTransientExperienciaLaboral(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'ExperienciaLaboral' identifier to be null", obj.getId());
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
        Assert.assertNotNull("Expected 'ExperienciaLaboral' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void ExperienciaLaboralIntegrationTest.testRemove() {
        ExperienciaLaboral obj = dod.getRandomExperienciaLaboral();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'ExperienciaLaboral' failed to provide an identifier", id);
        obj = ExperienciaLaboral.findExperienciaLaboral(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'ExperienciaLaboral' with identifier '" + id + "'", ExperienciaLaboral.findExperienciaLaboral(id));
    }
    
}
