package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSSN900", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSSN900", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsSn900 {

    @XmlElement(name = "orig", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String orig;

    @XmlElement(name = "CSOSN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CSOSN;

    @XmlElement(name = "modBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String modBC;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pICMS;

    @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vICMS;

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
