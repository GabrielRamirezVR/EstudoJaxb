package models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisaliq;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PISAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PISAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
public class PisAliq {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pPIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pPis;

    @XmlElement(name = "vPIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vPis;

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

    public String getpPis() {
        return pPis;
    }

    public void setpPis(String pPis) {
        this.pPis = pPis;
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
