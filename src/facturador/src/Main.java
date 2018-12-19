import comportamentales.EsquemaOffline;
import comportamentales.EsquemaOnline;
import comportamentales.EsquemaStrategy;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
import estructurales.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){

ComprobantesFactory factory = new ComprobantesFactory();
        ComprobanteElectronico builder1 = new ComprobanteElectronico();
        EsquemaStrategy autorizador;
        ComprobanteElectronico builder2 = new ComprobanteElectronico();
        
        Scanner scan = new Scanner(System.in);
        
        //Seleccion de tipo de comprobante electronico
        System.out.println("Escoger tipo de comprobante electronico(ingrese un numero): ");
        System.out.println("1. Factura \n2. Guia de remision \n3. Nota de credito");
        int opc1 = scan.nextInt();
        while(opc1>3){
            System.out.println("Valor incorrecto: debe escoger una de las opciones");
            opc1 = scan.nextInt();
        }
        switch(opc1){
            case 1:
                builder1 = factory.getComprobante("FACTURA");
                System.out.println("[Ha escogido una factura]");
                builder1.setNombreCliente("Pedro");
                builder1.setCodigo(546241);
                builder1.setClaveAcceso("123456");
                break;
            case 2:
                builder1 = factory.getComprobante("GUIAREMISION");
                System.out.println("[Ha escogido una guia de remision]");
                builder1.setNombreCliente("Juan");
                builder1.setCodigo(205421);
                builder1.setClaveAcceso("568457");
                break;
            case 3:
                builder1 = factory.getComprobante("NOTACREDITO");
                System.out.println("[Ha escogido una nota de credito]");
                builder1.setNombreCliente("Jose");
                builder1.setCodigo(660247);
                builder1.setClaveAcceso("685324");
                break;
            case 4:
                System.out.println("Gracias");
                break;
        }
        
        //Perzonalizacion del comprobante
        System.out.println("Personalizar comprobante(ingrese un numero): ");
        System.out.println("1. Logo \n2. Lema \n3. ambos \n4. ninguno");
        int opc2 = scan.nextInt();
        while(opc2>4){
            System.out.println("Valor incorrecto: debe escoger una de las opciones");
            opc2 = scan.nextInt();
        }
        switch(opc2){
            case 1:
                builder2 = new LogoDecorator(builder1);
                System.out.println("[Ha puesto un logo]");
                break;
            case 2:
                builder2 = new FooterDecorator(builder1);
                System.out.println("[Ha puesto un lema]");
                break;
            case 3:
                builder2 = new LogoDecorator( new FooterDecorator(builder1));
                System.out.println("[Ha seleccionado ambas cosas]");
                break;
        }
        
        //Seleccionar esquema de facturación
        System.out.print("Elegir esquemas de facturación electrónica(ingrese un numero): \n");
        System.out.print("1. Online\n2. Offline\n");
        int opc3 = scan.nextInt();
        while(opc3 > 2){
            System.out.println("Valor incorrecto: debe escoger una de las opciones");
            opc3 = scan.nextInt();
        }
        switch(opc3){
            case 1:
                builder1.autorizar(new EsquemaOnline());
                break;
            case 2:
                builder1.autorizar(new EsquemaOffline());
                break;

        }
        System.out.println(builder1);
    }
}
