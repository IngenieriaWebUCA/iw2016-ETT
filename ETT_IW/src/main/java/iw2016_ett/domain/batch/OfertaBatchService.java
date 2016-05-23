package iw2016_ett.domain.batch;
import iw2016_ett.domain.Oferta;
import org.gvnix.addon.jpa.annotations.batch.GvNIXJpaBatch;
import org.springframework.stereotype.Service;

@Service
@GvNIXJpaBatch(entity = Oferta.class)
public class OfertaBatchService {
}
