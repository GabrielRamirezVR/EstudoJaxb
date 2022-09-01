package models.xml.nfeproc.nfe.infnfe.ide;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.ide.nfref.NfRef;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.IDE, namespace = TagXml.NAMESPACE)
@XmlType(name = TagXml.IDE)
@XmlAccessorType(XmlAccessType.FIELD)
public class Ide {

    @XmlElement(name = TagXml.CUF, namespace = TagXml.NAMESPACE)
    private String cUF;

    @XmlElement(name = TagXml.CNF, namespace = TagXml.NAMESPACE)
    private String cNF;

    @XmlElement(name = TagXml.NATOP, namespace = TagXml.NAMESPACE)
    private String natOp;

    @XmlElement(name = TagXml.INDPAG, namespace = TagXml.NAMESPACE)
    private String indPag;

    @XmlElement(name = TagXml.MOD, namespace = TagXml.NAMESPACE)
    private String mod;

    @XmlElement(name = TagXml.SERIE, namespace = TagXml.NAMESPACE)
    private String serie;

    @XmlElement(name = TagXml.NNF, namespace = TagXml.NAMESPACE)
    private String nNF;

    @XmlElement(name = TagXml.DHEMI, namespace = TagXml.NAMESPACE)
    private String dhEmi;

    @XmlElement(name = TagXml.DHSAIENT, namespace = TagXml.NAMESPACE)
    private String dhSaiEnt;

    @XmlElement(name = TagXml.TPNF, namespace = TagXml.NAMESPACE)
    private String tpNf;

    @XmlElement(name = TagXml.IDDEST, namespace = TagXml.NAMESPACE)
    private String idDest;

    @XmlElement(name = TagXml.CMUNFG, namespace = TagXml.NAMESPACE)
    private String cMunFg;

    @XmlElement(name = TagXml.TPIMP, namespace = TagXml.NAMESPACE)
    private String tpImp;

    @XmlElement(name = TagXml.TPEMIS, namespace = TagXml.NAMESPACE)
    private String tpEmis;

    @XmlElement(name = TagXml.CDV, namespace = TagXml.NAMESPACE)
    private String cDv;

    @XmlElement(name = TagXml.TPAMB, namespace = TagXml.NAMESPACE)
    private String tpAmb;

    @XmlElement(name = TagXml.FINNFE, namespace = TagXml.NAMESPACE)
    private String finNfe;

    @XmlElement(name = TagXml.INDFINAL, namespace = TagXml.NAMESPACE)
    private String indFinal;

    @XmlElement(name = TagXml.INDPRES, namespace = TagXml.NAMESPACE)
    private String indPres;

    @XmlElement(name = TagXml.PROCEMI, namespace = TagXml.NAMESPACE)
    private String procEmi;

    @XmlElement(name = TagXml.VERPROC, namespace = TagXml.NAMESPACE)
    private String verProc;

    @XmlElement(name = TagXml.DHCONT, namespace = TagXml.NAMESPACE)
    private String dhCont;

    @XmlElement(name = TagXml.XJUST, namespace = TagXml.NAMESPACE)
    private String xJust;

    @SerializedName(TagXml.NFREF)
    @XmlElement(name = TagXml.NFREF, namespace = TagXml.NAMESPACE)
    private NfRef nfRef;

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

    public String getIndPag() {
        return indPag;
    }

    public void setIndPag(String indPag) {
        this.indPag = indPag;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
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

    public String getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(String dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
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

    public String getDhCont() {
        return dhCont;
    }

    public void setDhCont(String dhCont) {
        this.dhCont = dhCont;
    }

    public String getxJust() {
        return xJust;
    }

    public void setxJust(String xJust) {
        this.xJust = xJust;
    }

    public NfRef getNfRef() {
        return nfRef;
    }

    public void setNfRef(NfRef nfRef) {
        this.nfRef = nfRef;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
