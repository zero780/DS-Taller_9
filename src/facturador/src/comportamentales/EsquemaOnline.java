package comportamentales;

import creacional.ComprobanteElectronico;

public class EsquemaOnline implements EsquemaStrategy {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        Integer nuevoNumeroAutorización = (int) (Math.random() * 2000) + 1000;
        comprobante.setNumeroAutorizacion(String.valueOf(nuevoNumeroAutorización));

    }
}
