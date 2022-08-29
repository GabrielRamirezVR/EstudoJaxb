package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSSN101", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSSN101", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSn101 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CSOSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CSOSN;

    @XmlElement(name = "pCredSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pCredSN;

    @XmlElement(name = "vCredICMSSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vCredICMSSN;

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

    public String getpCredSN() {
        return pCredSN;
    }

    public void setpCredSN(String pCredSN) {
        this.pCredSN = pCredSN;
    }

    public String getvCredICMSSN() {
        return vCredICMSSN;
    }

    public void setvCredICMSSN(String vCredICMSSN) {
        this.vCredICMSSN = vCredICMSSN;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
