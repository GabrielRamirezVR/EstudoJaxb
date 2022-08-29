package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSSN500", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSSN500", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSn500 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CSOSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CSOSN;

    @XmlElement(name = "vBCSTRet", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBCSTRet;

    @XmlElement(name = "vICMSSTRet", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMSSTRet;

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

    public String getvBCSTRet() {
        return vBCSTRet;
    }

    public void setvBCSTRet(String vBCSTRet) {
        this.vBCSTRet = vBCSTRet;
    }

    public String getvICMSSTRet() {
        return vICMSSTRet;
    }

    public void setvICMSSTRet(String vICMSSTRet) {
        this.vICMSSTRet = vICMSSTRet;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
