package models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisoutr;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PISOutr", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PISOutr", namespace = "http://www.portalfiscal.inf.br/nfe")
public class PisOutr {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pPIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pPIS;

    @XmlElement(name = "qBCProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qBCProd;

    @XmlElement(name = "vAliqProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vAliqProd;

    @XmlElement(name = "vPIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vPIS;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpPIS() {
        return pPIS;
    }

    public void setpPIS(String pPIS) {
        this.pPIS = pPIS;
    }

    public String getqBCProd() {
        return qBCProd;
    }

    public void setqBCProd(String qBCProd) {
        this.qBCProd = qBCProd;
    }

    public String getvAliqProd() {
        return vAliqProd;
    }

    public void setvAliqProd(String vAliqProd) {
        this.vAliqProd = vAliqProd;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
