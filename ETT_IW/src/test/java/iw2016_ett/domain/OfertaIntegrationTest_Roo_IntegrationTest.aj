// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.OfertaDataOnDemand;
import iw2016_ett.domain.OfertaIntegrationTest;
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

privileged aspect OfertaIntegrationTest_Roo_IntegrationTest {
    
    declare @type: OfertaIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: OfertaIntegrationTest: @ContextConfiguration(locations = "classpath*:/META-INF/spring/applicationContext*.xml");
    
    declare @type: OfertaIntegrationTest: @Transactional;
    
    @Autowired
    OfertaDataOnDemand OfertaIntegrationTest.dod;
    
    @Test
    public void OfertaIntegrationTest.testCountOfertas() {
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", dod.getRandomOferta());
        long count = Oferta.countOfertas();
        Assert.assertTrue("Counter for 'Oferta' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void OfertaIntegrationTest.testFindOferta() {
        Oferta obj = dod.getRandomOferta();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to provide an identifier", id);
        obj = Oferta.findOferta(id);
        Assert.assertNotNull("Find method for 'Oferta' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Oferta' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void OfertaIntegrationTest.testFindAllOfertas() {
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", dod.getRandomOferta());
        long count = Oferta.countOfertas();
        Assert.assertTrue("Too expensive to perform a find all test for 'Oferta', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Oferta> result = Oferta.findAllOfertas();
        Assert.assertNotNull("Find all method for 'Oferta' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Oferta' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void OfertaIntegrationTest.testFindOfertaEntries() {
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", dod.getRandomOferta());
        long count = Oferta.countOfertas();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Oferta> result = Oferta.findOfertaEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Oferta' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Oferta' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void OfertaIntegrationTest.testFlush() {
        Oferta obj = dod.getRandomOferta();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to provide an identifier", id);
        obj = Oferta.findOferta(id);
        Assert.assertNotNull("Find method for 'Oferta' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyOferta(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Oferta' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void OfertaIntegrationTest.testMergeUpdate() {
        Oferta obj = dod.getRandomOferta();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to provide an identifier", id);
        obj = Oferta.findOferta(id);
        boolean modified =  dod.modifyOferta(obj);
        Integer currentVersion = obj.getVersion();
        Oferta merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'Oferta' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void OfertaIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", dod.getRandomOferta());
        Oferta obj = dod.getNewTransientOferta(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Oferta' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Oferta' identifier to be null", obj.getId());
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
        Assert.assertNotNull("Expected 'Oferta' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void OfertaIntegrationTest.testRemove() {
        Oferta obj = dod.getRandomOferta();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Oferta' failed to provide an identifier", id);
        obj = Oferta.findOferta(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Oferta' with identifier '" + id + "'", Oferta.findOferta(id));
    }
    
}
