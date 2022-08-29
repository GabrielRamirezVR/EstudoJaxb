package models.xml.nfeproc.nfe.infnfe.det.prod;

import com.google.gson.GsonBuilder;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "prod", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prod")
public class Prod {
    @XmlElement(name = "cProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cProd;

    @XmlElement(name = "cEAN", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String ean;

    @XmlElement(name = "xProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xProd;

    @XmlElement(name = "NCM", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String ncm;

    @XmlElement(name = "CEST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cest;

    @XmlElement(name = "indEscala", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indEscala;

    @XmlElement(name = "CFOP", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cfop;

    @XmlElement(name = "uCom", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String uCom;

    @XmlElement(name = "vUnCom", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vUncom;

    @XmlElement(name = "vProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vProd;

    @XmlElement(name = "cEANTrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cEanTrib;

    @XmlElement(name = "uTrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String uTrib;

    @XmlElement(name = "qTrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qTrib;

    @XmlElement(name = "vUnTrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vUnTrib;

    @XmlElement(name = "indTot", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indTot;

    @XmlElement(name = "xPed", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xPed;

    @XmlElement(name = "nItemPed", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String nItemPed;

    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getIndEscala() {
        return indEscala;
    }

    public void setIndEscala(String indEscala) {
        this.indEscala = indEscala;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public String getvUncom() {
        return vUncom;
    }

    public void setvUncom(String vUncom) {
        this.vUncom = vUncom;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getcEanTrib() {
        return cEanTrib;
    }

    public void setcEanTrib(String cEanTrib) {
        this.cEanTrib = cEanTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public String getqTrib() {
        return qTrib;
    }

    public void setqTrib(String qTrib) {
        this.qTrib = qTrib;
    }

    public String getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(String vUnTrib) {
        this.vUnTrib = vUnTrib;
    }

    public String getIndTot() {
        return indTot;
    }

    public void setIndTot(String indTot) {
        this.indTot = indTot;
    }

    public String getxPed() {
        return xPed;
    }

    public void setxPed(String xPed) {
        this.xPed = xPed;
    }

    public String getnItemPed() {
        return nItemPed;
    }

    public void setnItemPed(String nItemPed) {
        this.nItemPed = nItemPed;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
