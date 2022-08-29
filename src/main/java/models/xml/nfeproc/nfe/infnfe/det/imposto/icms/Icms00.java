package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMS00", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS00", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Icms00 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "modBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String modBC;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pICMS;

    @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMS;

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

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpICMS() {
        return pICMS;
    }

    public void setpICMS(String pICMS) {
        this.pICMS = pICMS;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
