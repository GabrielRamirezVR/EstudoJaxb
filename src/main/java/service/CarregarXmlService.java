package service;

import models.xml.Xml;
import models.xml.nfeproc.NfeProc;

import javax.xml.bind.*;
import java.io.FileInputStream;
import java.util.Optional;

public class CarregarXmlService {

    /**
     * Realiza a conversao (unmarshal) de um arquivo XML em um objeto do seu tipo.
     *
     * @param pCaminhoArquivoXml caminho do arquivo XML que será feito o binding
     * @return novo objeto.
     */
    public Optional<NfeProc> carregarXml(String pCaminhoArquivoXml) {

        try {
            JAXBContext context = JAXBContext.newInstance(Xml.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Optional<Object> obj = Optional.ofNullable(unmarshaller.unmarshal(new FileInputStream(pCaminhoArquivoXml)));

            if(obj.isPresent()) {
                return Optional.of((NfeProc)obj.get());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }
}
