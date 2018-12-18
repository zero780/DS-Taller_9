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
public class FooterDecorator extends DetalleDecorator{

    public FooterDecorator(ComprobanteElectronico comprobante) {
        super(comprobante);
        super.getDetallesEmisor().add("Lema de empresa añadido");
    }

    public FooterDecorator() {
        this.detallesEmisor = new LinkedList<>();
    }
    
    @Override
    public List<String> getDetallesEmisor() {
        return this.comprobante.getDetallesEmisor();
    }   
}
