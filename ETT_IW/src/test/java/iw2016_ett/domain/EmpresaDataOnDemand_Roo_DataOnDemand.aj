// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.domain;

import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.EmpresaDataOnDemand;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.springframework.stereotype.Component;

privileged aspect EmpresaDataOnDemand_Roo_DataOnDemand {
    
    declare @type: EmpresaDataOnDemand: @Component;
    
    private Random EmpresaDataOnDemand.rnd = new SecureRandom();
    
    private List<Empresa> EmpresaDataOnDemand.data;
    
    public Empresa EmpresaDataOnDemand.getNewTransientEmpresa(int index) {
        Empresa obj = new Empresa();
        setActividad(obj, index);
        setCIF(obj, index);
        setEmail(obj, index);
        setEnable(obj, index);
        setN_Empleados(obj, index);
        setNombre(obj, index);
        setPassword(obj, index);
        setRol(obj, index);
        setUsername(obj, index);
        return obj;
    }
    
    public void EmpresaDataOnDemand.setActividad(Empresa obj, int index) {
        String actividad = "actividad_" + index;
        obj.setActividad(actividad);
    }
    
    public void EmpresaDataOnDemand.setCIF(Empresa obj, int index) {
        String CIF = "CIF_" + index;
        obj.setCIF(CIF);
    }
    
    public void EmpresaDataOnDemand.setEmail(Empresa obj, int index) {
        String email = "foo" + index + "@bar.com";
        obj.setEmail(email);
    }
    
    public void EmpresaDataOnDemand.setEnable(Empresa obj, int index) {
        int enable = index;
        obj.setEnable(enable);
    }
    
    public void EmpresaDataOnDemand.setN_Empleados(Empresa obj, int index) {
        int n_Empleados = index;
        obj.setN_Empleados(n_Empleados);
    }
    
    public void EmpresaDataOnDemand.setNombre(Empresa obj, int index) {
        String nombre = "nombre_" + index;
        obj.setNombre(nombre);
    }
    
    public void EmpresaDataOnDemand.setPassword(Empresa obj, int index) {
        String password = "password_" + index;
        obj.setPassword(password);
    }
    
    public void EmpresaDataOnDemand.setRol(Empresa obj, int index) {
        String rol = "rol_" + index;
        obj.setRol(rol);
    }
    
    public void EmpresaDataOnDemand.setUsername(Empresa obj, int index) {
        String username = "username_" + index;
        obj.setUsername(username);
    }
    
    public Empresa EmpresaDataOnDemand.getSpecificEmpresa(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Empresa obj = data.get(index);
        Long id = obj.getId();
        return Empresa.findEmpresa(id);
    }
    
    public Empresa EmpresaDataOnDemand.getRandomEmpresa() {
        init();
        Empresa obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Empresa.findEmpresa(id);
    }
    
    public boolean EmpresaDataOnDemand.modifyEmpresa(Empresa obj) {
        return false;
    }
    
    public void EmpresaDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Empresa.findEmpresaEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Empresa' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Empresa>();
        for (int i = 0; i < 10; i++) {
            Empresa obj = getNewTransientEmpresa(i);
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
            data.add(obj);
        }
    }
    
}