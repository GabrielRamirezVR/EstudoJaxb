package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMSPart", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMSPart", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IcmsPart {

    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String CST;

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

    @XmlElement(name = "pBCOp", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pBCOp;

    @XmlElement(name = "UFST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String UFST;

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
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

    public String getpBCOp() {
        return pBCOp;
    }

    public void setpBCOp(String pBCOp) {
        this.pBCOp = pBCOp;
    }

    public String getUFST() {
        return UFST;
    }

    public void setUFST(String UFST) {
        this.UFST = UFST;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
