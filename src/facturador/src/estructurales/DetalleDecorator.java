package estructurales;

import creacional.ComprobanteElectronico;
import java.util.LinkedList;
import java.util.List;

public abstract class DetalleDecorator extends ComprobanteElectronico{

    protected ComprobanteElectronico comprobante;
    
    public DetalleDecorator(ComprobanteElectronico comprobante) {
        this.comprobante = comprobante;
    }
    
    public DetalleDecorator() {
        this.detallesEmisor = new LinkedList<>();
    }
    
    public ComprobanteElectronico getComprobante() {
        return comprobante;
    }
    
    @Override
    public List<String> getDetallesEmisor() {
        return this.comprobante.getDetallesEmisor();
    }
   
    
}
