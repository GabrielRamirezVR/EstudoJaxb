package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMS60", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS60", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Icms60 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

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

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
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
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
