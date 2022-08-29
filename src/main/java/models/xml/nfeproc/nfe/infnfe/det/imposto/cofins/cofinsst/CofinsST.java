package models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsst;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "COFINSST", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COFINSST", namespace = "http://www.portalfiscal.inf.br/nfe")
public class CofinsST {

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pCOFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pCOFINS;

    @XmlElement(name = "qBCProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qBCProd;

    @XmlElement(name = "vAliqProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vAliqProd;

    @XmlElement(name = "vCOFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vCOFINS;

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getpCOFINS() {
        return pCOFINS;
    }

    public void setpCOFINS(String pCOFINS) {
        this.pCOFINS = pCOFINS;
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
