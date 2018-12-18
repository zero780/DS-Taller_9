package comportamentales;

import creacional.ComprobanteElectronico;

public class EsquemaOffline implements EsquemaStrategy {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setNumeroAutorizacion(comprobante.getClaveAcceso());
    }
}
