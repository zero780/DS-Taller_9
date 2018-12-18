package comportamentales;

import creacional.ComprobanteElectronico;

public class AutorizadorSRIContext {

    private EsquemaStrategy esquemaStrategy;


    public void autorizar(ComprobanteElectronico comprobante){
        esquemaStrategy.autorizar(comprobante);
    }

    public void setEsquema(EsquemaStrategy esquema){
        this.esquemaStrategy = esquema;
    };
}
