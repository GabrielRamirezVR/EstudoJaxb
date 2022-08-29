package models.xml.nfeproc.nfe;

import com.google.gson.GsonBuilder;
import models.xml.nfeproc.nfe.infnfe.InfNfe;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "NFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NFe")
public class Nfe {

    @XmlElement(name = "infNFe", namespace = "http://www.portalfiscal.inf.br/nfe", type = InfNfe.class)
    private InfNfe infNfe;

    public InfNfe getInfNfe() {
        return infNfe;
    }

    public void setInfNfe(InfNfe infNfe) {
        this.infNfe = infNfe;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
