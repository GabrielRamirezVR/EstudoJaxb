package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSSN102", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSSN102", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSn102 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CSOSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CSOSN;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCSOSN() {
        return CSOSN;
    }

    public void setCSOSN(String CSOSN) {
        this.CSOSN = CSOSN;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
