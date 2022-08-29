package models.xml.nfeproc.nfe.infnfe.ide;

import com.google.gson.GsonBuilder;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ide", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlType(name = "ide")
@XmlAccessorType(XmlAccessType.FIELD)
public class Ide {

    @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cUF;

    @XmlElement(name = "cNF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cNF;

    @XmlElement(name = "natOp", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String natOp;

    @XmlElement(name = "serie", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String serie;

    @XmlElement(name = "nNF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String nNF;

    @XmlElement(name = "dhEmi", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String dhEmi;


    @XmlElement(name = "tpNF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String tpNf;

    @XmlElement(name = "idDest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String idDest;

    @XmlElement(name = "cMunFG", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cMunFg;

    @XmlElement(name = "tpImp", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String tpImp;

    @XmlElement(name = "tpEmis", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String tpEmis;

    @XmlElement(name = "cDV", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cDv;

    @XmlElement(name = "tpAmb", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String tpAmb;

    @XmlElement(name = "finNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String finNfe;

    @XmlElement(name = "indFinal", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indFinal;

    @XmlElement(name = "indPres", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indPres;

    @XmlElement(name = "indIntermed", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indIntermed;

    @XmlElement(name = "procEmi", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String procEmi;

    @XmlElement(name = "verProc", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String verProc;

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getcNF() {
        return cNF;
    }

    public void setcNF(String cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public String getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    public String getTpNf() {
        return tpNf;
    }

    public void setTpNf(String tpNf) {
        this.tpNf = tpNf;
    }

    public String getIdDest() {
        return idDest;
    }

    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    public String getcMunFg() {
        return cMunFg;
    }

    public void setcMunFg(String cMunFg) {
        this.cMunFg = cMunFg;
    }

    public String getTpImp() {
        return tpImp;
    }

    public void setTpImp(String tpImp) {
        this.tpImp = tpImp;
    }

    public String getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(String tpEmis) {
        this.tpEmis = tpEmis;
    }

    public String getcDv() {
        return cDv;
    }

    public void setcDv(String cDv) {
        this.cDv = cDv;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getFinNfe() {
        return finNfe;
    }

    public void setFinNfe(String finNfe) {
        this.finNfe = finNfe;
    }

    public String getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(String indFinal) {
        this.indFinal = indFinal;
    }

    public String getIndPres() {
        return indPres;
    }

    public void setIndPres(String indPres) {
        this.indPres = indPres;
    }

    public String getIndIntermed() {
        return indIntermed;
    }

    public void setIndIntermed(String indIntermed) {
        this.indIntermed = indIntermed;
    }

    public String getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(String procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
