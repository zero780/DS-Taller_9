/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurales;

import creacional.ComprobanteElectronico;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LogoDecorator extends DetalleDecorator{

    public LogoDecorator(ComprobanteElectronico comprobante) {
        super(comprobante);
        super.getDetallesEmisor().add("Logo de empresa añadido");
    }

    @Override
    public List<String> getDetallesEmisor() {
        return this.comprobante.getDetallesEmisor();
    }
    
}
