package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSt {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CST;

    @XmlElement(name = "vBCSTRet", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBCSTRet;

    @XmlElement(name = "vICMSSTRet", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMSSTRet;

    @XmlElement(name = "vBCSTDet", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBCSTDet;

    @XmlElement(name = "vICMSSTDest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMSSTDest;

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
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

    public String getvBCSTDet() {
        return vBCSTDet;
    }

    public void setvBCSTDet(String vBCSTDet) {
        this.vBCSTDet = vBCSTDet;
    }

    public String getvICMSSTDest() {
        return vICMSSTDest;
    }

    public void setvICMSSTDest(String vICMSSTDest) {
        this.vICMSSTDest = vICMSSTDest;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
