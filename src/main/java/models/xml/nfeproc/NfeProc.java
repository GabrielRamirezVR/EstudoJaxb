package models.xml.nfeproc;

import com.google.gson.GsonBuilder;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.Nfe;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.NFEPROC, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.NFEPROC)
public class NfeProc {
    @XmlAttribute(name = TagXml.VERSAO)
    private String versao;

    @XmlElement(name = TagXml.NFE, namespace = TagXml.NAMESPACE)
    private Nfe nfe;

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
