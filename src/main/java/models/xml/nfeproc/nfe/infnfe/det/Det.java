package models.xml.nfeproc.nfe.infnfe.det;

import com.google.gson.GsonBuilder;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.det.imposto.Imposto;
import models.xml.nfeproc.nfe.infnfe.det.prod.Prod;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.DET, namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.DET)
public class Det {

    @XmlAttribute(name = TagXml.NITEM)
    private String nItem;

    @XmlElement(name = TagXml.PROD, namespace = "http://www.portalfiscal.inf.br/nfe")
    private Prod prod;

    @XmlElement(name = "imposto", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Imposto imposto;

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    public Prod getProd() {
        return prod;
    }

    public void setProd(Prod prod) {
        this.prod = prod;
    }

    public Imposto getImposto() {
        return imposto;
    }

    public void setImposto(Imposto imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
