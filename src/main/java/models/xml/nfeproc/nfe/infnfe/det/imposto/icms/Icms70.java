package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMS70", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS70", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Icms70 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "modBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String modBC;

    @XmlElement(name = "pRedBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pRedBC;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pICMS;

    @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMS;

    @XmlElement(name = "modBCST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String modBCST;

    @XmlElement(name = "pMVAST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pMVAST;

    @XmlElement(name = "pRedBCST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pRedBCST;

    @XmlElement(name = "vBCST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBCST;

    @XmlElement(name = "pICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pICMSST;

    @XmlElement(name = "vICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMSST;

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

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getpRedBC() {
        return pRedBC;
    }

    public void setpRedBC(String pRedBC) {
        this.pRedBC = pRedBC;
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

    public String getModBCST() {
        return modBCST;
    }

    public void setModBCST(String modBCST) {
        this.modBCST = modBCST;
    }

    public String getpMVAST() {
        return pMVAST;
    }

    public void setpMVAST(String pMVAST) {
        this.pMVAST = pMVAST;
    }

    public String getpRedBCST() {
        return pRedBCST;
    }

    public void setpRedBCST(String pRedBCST) {
        this.pRedBCST = pRedBCST;
    }

    public String getvBCST() {
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        this.vBCST = vBCST;
    }

    public String getpICMSST() {
        return pICMSST;
    }

    public void setpICMSST(String pICMSST) {
        this.pICMSST = pICMSST;
    }

    public String getvICMSST() {
        return vICMSST;
    }

    public void setvICMSST(String vICMSST) {
        this.vICMSST = vICMSST;
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
