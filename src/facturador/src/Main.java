import comportamentales.AutorizadorSRIContext;
import comportamentales.EsquemaOffline;
import comportamentales.EsquemaOnline;

public class Main {

    public static void main(String args[]){


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

        

    }
}
