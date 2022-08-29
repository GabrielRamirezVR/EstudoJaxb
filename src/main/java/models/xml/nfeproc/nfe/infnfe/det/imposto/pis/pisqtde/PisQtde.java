package models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisqtde;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PISQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PISQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
public class PisQtde {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "qBCProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qBCProd;

    @XmlElement(name = "vAliqProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vAliqProd;

    @XmlElement(name = "vPIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vPis;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
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

    public String getvPis() {
        return vPis;
    }

    public void setvPis(String vPis) {
        this.vPis = vPis;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
