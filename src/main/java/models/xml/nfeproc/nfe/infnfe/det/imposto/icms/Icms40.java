package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMS40", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS40", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Icms40 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "vICMSDeson", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMSDeson;

    @XmlElement(name = "motDesICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String motDesICMS;

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

    public String getvICMSDeson() {
        return vICMSDeson;
    }

    public void setvICMSDeson(String vICMSDeson) {
        this.vICMSDeson = vICMSDeson;
    }

    public String getMotDesICMS() {
        return motDesICMS;
    }

    public void setMotDesICMS(String motDesICMS) {
        this.motDesICMS = motDesICMS;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
