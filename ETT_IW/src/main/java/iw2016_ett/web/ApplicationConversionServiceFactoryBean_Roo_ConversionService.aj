// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package iw2016_ett.web;

import iw2016_ett.domain.Demandante;
import iw2016_ett.domain.Empresa;
import iw2016_ett.domain.ExperienciaLaboral;
import iw2016_ett.domain.Formacion;
import iw2016_ett.domain.Inscripcion;
import iw2016_ett.domain.Localizacion;
import iw2016_ett.domain.Oferta;
import iw2016_ett.domain.PuestoTrabajo;
import iw2016_ett.domain.Titulaciones;
import iw2016_ett.domain.Users;
import iw2016_ett.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Demandante, String> ApplicationConversionServiceFactoryBean.getDemandanteToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Demandante, java.lang.String>() {
            public String convert(Demandante demandante) {
                return new StringBuilder().append(demandante.getNombre()).append(' ').append(demandante.getApellidos()).append(' ').append(demandante.getFechaNacimiento()).append(' ').append(demandante.getDireccion()).toString();
            }
        };
    }
    
    public Converter<Long, Demandante> ApplicationConversionServiceFactoryBean.getIdToDemandanteConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Demandante>() {
            public iw2016_ett.domain.Demandante convert(java.lang.Long id) {
                return Demandante.findDemandante(id);
            }
        };
    }
    
    public Converter<String, Demandante> ApplicationConversionServiceFactoryBean.getStringToDemandanteConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Demandante>() {
            public iw2016_ett.domain.Demandante convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Demandante.class);
            }
        };
    }
    
    public Converter<Empresa, String> ApplicationConversionServiceFactoryBean.getEmpresaToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Empresa, java.lang.String>() {
            public String convert(Empresa empresa) {
                return new StringBuilder().append(empresa.getCIF()).append(' ').append(empresa.getNombre()).append(' ').append(empresa.getActividad()).append(' ').append(empresa.getN_Empleados()).toString();
            }
        };
    }
    
    public Converter<Long, Empresa> ApplicationConversionServiceFactoryBean.getIdToEmpresaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Empresa>() {
            public iw2016_ett.domain.Empresa convert(java.lang.Long id) {
                return Empresa.findEmpresa(id);
            }
        };
    }
    
    public Converter<String, Empresa> ApplicationConversionServiceFactoryBean.getStringToEmpresaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Empresa>() {
            public iw2016_ett.domain.Empresa convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Empresa.class);
            }
        };
    }
    
    public Converter<ExperienciaLaboral, String> ApplicationConversionServiceFactoryBean.getExperienciaLaboralToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.ExperienciaLaboral, java.lang.String>() {
            public String convert(ExperienciaLaboral experienciaLaboral) {
                return new StringBuilder().append(experienciaLaboral.getEmpresa()).append(' ').append(experienciaLaboral.getFechaInicio()).append(' ').append(experienciaLaboral.getFechaFin()).toString();
            }
        };
    }
    
    public Converter<Long, ExperienciaLaboral> ApplicationConversionServiceFactoryBean.getIdToExperienciaLaboralConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.ExperienciaLaboral>() {
            public iw2016_ett.domain.ExperienciaLaboral convert(java.lang.Long id) {
                return ExperienciaLaboral.findExperienciaLaboral(id);
            }
        };
    }
    
    public Converter<String, ExperienciaLaboral> ApplicationConversionServiceFactoryBean.getStringToExperienciaLaboralConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.ExperienciaLaboral>() {
            public iw2016_ett.domain.ExperienciaLaboral convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), ExperienciaLaboral.class);
            }
        };
    }
    
    public Converter<Formacion, String> ApplicationConversionServiceFactoryBean.getFormacionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Formacion, java.lang.String>() {
            public String convert(Formacion formacion) {
                return new StringBuilder().append(formacion.getTitulo()).append(' ').append(formacion.getFechaInicio()).append(' ').append(formacion.getFechaFin()).append(' ').append(formacion.getObservaciones()).toString();
            }
        };
    }
    
    public Converter<Long, Formacion> ApplicationConversionServiceFactoryBean.getIdToFormacionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Formacion>() {
            public iw2016_ett.domain.Formacion convert(java.lang.Long id) {
                return Formacion.findFormacion(id);
            }
        };
    }
    
    public Converter<String, Formacion> ApplicationConversionServiceFactoryBean.getStringToFormacionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Formacion>() {
            public iw2016_ett.domain.Formacion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Formacion.class);
            }
        };
    }
    
    public Converter<Inscripcion, String> ApplicationConversionServiceFactoryBean.getInscripcionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Inscripcion, java.lang.String>() {
            public String convert(Inscripcion inscripcion) {
                return "(no displayable fields)";
            }
        };
    }
    
    public Converter<Long, Inscripcion> ApplicationConversionServiceFactoryBean.getIdToInscripcionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Inscripcion>() {
            public iw2016_ett.domain.Inscripcion convert(java.lang.Long id) {
                return Inscripcion.findInscripcion(id);
            }
        };
    }
    
    public Converter<String, Inscripcion> ApplicationConversionServiceFactoryBean.getStringToInscripcionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Inscripcion>() {
            public iw2016_ett.domain.Inscripcion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Inscripcion.class);
            }
        };
    }
    
    public Converter<Localizacion, String> ApplicationConversionServiceFactoryBean.getLocalizacionToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Localizacion, java.lang.String>() {
            public String convert(Localizacion localizacion) {
                return new StringBuilder().append(localizacion.getPais()).append(' ').append(localizacion.getComunidad()).append(' ').append(localizacion.getProvincia()).append(' ').append(localizacion.getLocalidad()).toString();
            }
        };
    }
    
    public Converter<Long, Localizacion> ApplicationConversionServiceFactoryBean.getIdToLocalizacionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Localizacion>() {
            public iw2016_ett.domain.Localizacion convert(java.lang.Long id) {
                return Localizacion.findLocalizacion(id);
            }
        };
    }
    
    public Converter<String, Localizacion> ApplicationConversionServiceFactoryBean.getStringToLocalizacionConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Localizacion>() {
            public iw2016_ett.domain.Localizacion convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Localizacion.class);
            }
        };
    }
    
    public Converter<Oferta, String> ApplicationConversionServiceFactoryBean.getOfertaToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Oferta, java.lang.String>() {
            public String convert(Oferta oferta) {
                return new StringBuilder().append(oferta.getTitulo()).append(' ').append(oferta.getTipoContrato()).append(' ').append(oferta.getFechaInicio()).append(' ').append(oferta.getNumeroVacantes()).toString();
            }
        };
    }
    
    public Converter<Long, Oferta> ApplicationConversionServiceFactoryBean.getIdToOfertaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Oferta>() {
            public iw2016_ett.domain.Oferta convert(java.lang.Long id) {
                return Oferta.findOferta(id);
            }
        };
    }
    
    public Converter<String, Oferta> ApplicationConversionServiceFactoryBean.getStringToOfertaConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Oferta>() {
            public iw2016_ett.domain.Oferta convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Oferta.class);
            }
        };
    }
    
    public Converter<PuestoTrabajo, String> ApplicationConversionServiceFactoryBean.getPuestoTrabajoToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.PuestoTrabajo, java.lang.String>() {
            public String convert(PuestoTrabajo puestoTrabajo) {
                return new StringBuilder().append(puestoTrabajo.getNombre()).toString();
            }
        };
    }
    
    public Converter<Long, PuestoTrabajo> ApplicationConversionServiceFactoryBean.getIdToPuestoTrabajoConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.PuestoTrabajo>() {
            public iw2016_ett.domain.PuestoTrabajo convert(java.lang.Long id) {
                return PuestoTrabajo.findPuestoTrabajo(id);
            }
        };
    }
    
    public Converter<String, PuestoTrabajo> ApplicationConversionServiceFactoryBean.getStringToPuestoTrabajoConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.PuestoTrabajo>() {
            public iw2016_ett.domain.PuestoTrabajo convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), PuestoTrabajo.class);
            }
        };
    }
    
    public Converter<Titulaciones, String> ApplicationConversionServiceFactoryBean.getTitulacionesToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Titulaciones, java.lang.String>() {
            public String convert(Titulaciones titulaciones) {
                return new StringBuilder().append(titulaciones.getNombre()).toString();
            }
        };
    }
    
    public Converter<Long, Titulaciones> ApplicationConversionServiceFactoryBean.getIdToTitulacionesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Titulaciones>() {
            public iw2016_ett.domain.Titulaciones convert(java.lang.Long id) {
                return Titulaciones.findTitulaciones(id);
            }
        };
    }
    
    public Converter<String, Titulaciones> ApplicationConversionServiceFactoryBean.getStringToTitulacionesConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Titulaciones>() {
            public iw2016_ett.domain.Titulaciones convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Titulaciones.class);
            }
        };
    }
    
    public Converter<Users, String> ApplicationConversionServiceFactoryBean.getUsersToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<iw2016_ett.domain.Users, java.lang.String>() {
            public String convert(Users users) {
                return new StringBuilder().append(users.getUsername()).append(' ').append(users.getPassword()).append(' ').append(users.getEnable()).append(' ').append(users.getRol()).toString();
            }
        };
    }
    
    public Converter<Long, Users> ApplicationConversionServiceFactoryBean.getIdToUsersConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, iw2016_ett.domain.Users>() {
            public iw2016_ett.domain.Users convert(java.lang.Long id) {
                return Users.findUsers(id);
            }
        };
    }
    
    public Converter<String, Users> ApplicationConversionServiceFactoryBean.getStringToUsersConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, iw2016_ett.domain.Users>() {
            public iw2016_ett.domain.Users convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Users.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getDemandanteToStringConverter());
        registry.addConverter(getIdToDemandanteConverter());
        registry.addConverter(getStringToDemandanteConverter());
        registry.addConverter(getEmpresaToStringConverter());
        registry.addConverter(getIdToEmpresaConverter());
        registry.addConverter(getStringToEmpresaConverter());
        registry.addConverter(getExperienciaLaboralToStringConverter());
        registry.addConverter(getIdToExperienciaLaboralConverter());
        registry.addConverter(getStringToExperienciaLaboralConverter());
        registry.addConverter(getFormacionToStringConverter());
        registry.addConverter(getIdToFormacionConverter());
        registry.addConverter(getStringToFormacionConverter());
        registry.addConverter(getInscripcionToStringConverter());
        registry.addConverter(getIdToInscripcionConverter());
        registry.addConverter(getStringToInscripcionConverter());
        registry.addConverter(getLocalizacionToStringConverter());
        registry.addConverter(getIdToLocalizacionConverter());
        registry.addConverter(getStringToLocalizacionConverter());
        registry.addConverter(getOfertaToStringConverter());
        registry.addConverter(getIdToOfertaConverter());
        registry.addConverter(getStringToOfertaConverter());
        registry.addConverter(getPuestoTrabajoToStringConverter());
        registry.addConverter(getIdToPuestoTrabajoConverter());
        registry.addConverter(getStringToPuestoTrabajoConverter());
        registry.addConverter(getTitulacionesToStringConverter());
        registry.addConverter(getIdToTitulacionesConverter());
        registry.addConverter(getStringToTitulacionesConverter());
        registry.addConverter(getUsersToStringConverter());
        registry.addConverter(getIdToUsersConverter());
        registry.addConverter(getStringToUsersConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}
