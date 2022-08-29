import models.xml.nfeproc.NfeProc;
import service.CarregarXmlService;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<NfeProc> nfeProc =  new CarregarXmlService().carregarXml("C://Users//Desenvolvimento//Desktop//nfeTeste.xml");

        if(nfeProc.isPresent()) {
            System.out.println(nfeProc.get());
        } else {
            System.out.println("Não foi possível carregar o XML!");
        }
    }
}
