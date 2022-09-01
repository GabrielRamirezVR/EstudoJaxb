package models.xml.nfeproc.nfe;

import com.google.gson.GsonBuilder;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.InfNfe;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.NFE, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.NFE)
public class Nfe {

    @XmlElement(name = TagXml.INFNFE, namespace = TagXml.NAMESPACE)
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
