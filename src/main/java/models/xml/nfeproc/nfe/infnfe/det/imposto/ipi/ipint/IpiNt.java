package models.xml.nfeproc.nfe.infnfe.det.imposto.ipi.ipint;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "IPINT", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPINT", namespace = "http://www.portalfiscal.inf.br/nfe")
public class IpiNt {

    @SerializedName("CST")
    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cst;

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
