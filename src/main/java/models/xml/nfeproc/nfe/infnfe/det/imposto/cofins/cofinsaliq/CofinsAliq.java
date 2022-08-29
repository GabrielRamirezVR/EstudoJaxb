package models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsaliq;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "COFINSAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COFINSAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
public class CofinsAliq {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pCOFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pCOFINS;

    @XmlElement(name = "vCOFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vCOFINS;

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

    public String getpCOFINS() {
        return pCOFINS;
    }

    public void setpCOFINS(String pCOFINS) {
        this.pCOFINS = pCOFINS;
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
