package models.xml.nfeproc;

import com.google.gson.GsonBuilder;
import models.xml.nfeproc.nfe.Nfe;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
public class NfeProc {
    @XmlAttribute(name = "xmlns")
    private String xmlns;

    @XmlAttribute(name = "versao")
    private String versao;

    @XmlElement(name = "NFe", namespace = "http://www.portalfiscal.inf.br/nfe", type = Nfe.class)
    private Nfe nfe;

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Nfe getNfe() {
        return nfe;
    }

    public void setNfe(Nfe nfe) {
        this.nfe = nfe;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
