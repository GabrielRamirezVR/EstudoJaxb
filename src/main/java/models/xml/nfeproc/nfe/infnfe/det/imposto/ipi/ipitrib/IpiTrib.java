package models.xml.nfeproc.nfe.infnfe.det.imposto.ipi.ipitrib;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "IPITrib", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPITrib", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IpiTrib {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "pIPI", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String pIPI;

    @XmlElement(name = "qUnid", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qUnid;

    @XmlElement(name = "vUnid", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vUnid;

    @XmlElement(name = "vIPI", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vIPI;

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

    public String getpIPI() {
        return pIPI;
    }

    public void setpIPI(String pIPI) {
        this.pIPI = pIPI;
    }

    public String getqUnid() {
        return qUnid;
    }

    public void setqUnid(String qUnid) {
        this.qUnid = qUnid;
    }

    public String getvUnid() {
        return vUnid;
    }

    public void setvUnid(String vUnid) {
        this.vUnid = vUnid;
    }

    public String getvIPI() {
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        this.vIPI = vIPI;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
