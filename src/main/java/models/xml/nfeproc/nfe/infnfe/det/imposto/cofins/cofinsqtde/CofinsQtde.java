package models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsqtde;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "COFINSQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COFINSQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
public class CofinsQtde {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "qBCProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qBCProd;

    @XmlElement(name = "vAliqProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vAliqProd;

    @XmlElement(name = "vCOFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vCOFINS;

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

    public String getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
