package iw2016_ett.domain.batch;
import iw2016_ett.domain.Formacion;
import org.gvnix.addon.jpa.annotations.batch.GvNIXJpaBatch;
import org.springframework.stereotype.Service;

@Service
@GvNIXJpaBatch(entity = Formacion.class)
public class FormacionBatchService {
}
