package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSSN202", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSSN202", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSn202 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CSOSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CSOSN;

    @XmlElement(name = "pMVAST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pMvast;

    @XmlElement(name = "pRedBCST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pRedcSt;

    @XmlElement(name = "vBCST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBcSt;

    @XmlElement(name = "pICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pIcmsSt;

    @XmlElement(name = "vICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vIcmsSt;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getpMvast() {
        return pMvast;
    }

    public void setpMvast(String pMvast) {
        this.pMvast = pMvast;
    }

    public String getpRedcSt() {
        return pRedcSt;
    }

    public void setpRedcSt(String pRedcSt) {
        this.pRedcSt = pRedcSt;
    }

    public String getvBcSt() {
        return vBcSt;
    }

    public void setvBcSt(String vBcSt) {
        this.vBcSt = vBcSt;
    }

    public String getpIcmsSt() {
        return pIcmsSt;
    }

    public void setpIcmsSt(String pIcmsSt) {
        this.pIcmsSt = pIcmsSt;
    }

    public String getvIcmsSt() {
        return vIcmsSt;
    }

    public void setvIcmsSt(String vIcmsSt) {
        this.vIcmsSt = vIcmsSt;
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
