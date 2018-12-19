import comportamentales.AutorizadorSRIContext;
import comportamentales.EsquemaOffline;
import comportamentales.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.Factura;
import creacional.GuiaRemision;
import creacional.NotaCredito;
import estructurales.*;

public class Main {

    public static void main(String args[]){

        //aqui pruebo los decorators
        ComprobanteElectronico comp1 = new LogoDecorator(new FooterDecorator(new ComprobanteElectronico()));
        System.out.println(comp1.getDetallesEmisor());
        ComprobanteElectronico comp2 = new FooterDecorator(new LogoDecorator(new ComprobanteElectronico()));
        System.out.println(comp2.getDetallesEmisor());
        ComprobanteElectronico comp3 = new FooterDecorator (new ComprobanteElectronico());
        System.out.println(comp3.getDetallesEmisor());  
        //fin
        
        String opcion = "";

        System.out.print("Elegir esquemas de facturación electrónica: \n");
        System.out.print("1. Online\n2. Offline\n");

        //tomar la opcion del usuario

        AutorizadorSRIContext autorizador = new AutorizadorSRIContext();

        switch (opcion){
            case "1":
                autorizador.setEsquema(new EsquemaOnline());
            case "2":
                autorizador.setEsquema(new EsquemaOffline());

        }

        ComprobanteElectronico comprobate;

        //se debe elegir alguna,
        comprobate = new Factura();
        autorizador.autorizar(comprobate);

        comprobate = new GuiaRemision();
        autorizador.autorizar(comprobate);

        comprobate = new NotaCredito();
        autorizador.autorizar(comprobate);
        
        


    }
}
