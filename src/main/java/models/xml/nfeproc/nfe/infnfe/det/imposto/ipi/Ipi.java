package models.xml.nfeproc.nfe.infnfe.det.imposto.ipi;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.xml.nfeproc.nfe.infnfe.det.imposto.ipi.ipint.IpiNt;
import models.xml.nfeproc.nfe.infnfe.det.imposto.ipi.ipitrib.IpiTrib;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "IPI", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPI", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Ipi {

    @XmlElement(name = "cIEnq", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cIEnq;

    @SerializedName("CNPJProd")
    @XmlElement(name = "CNPJProd", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cnpjProd;

    @XmlElement(name = "cSelo", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cSelo;

    @XmlElement(name = "qSelo", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String qSelo;

    @XmlElement(name = "cEnq", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cEnq;

    @SerializedName("IPITrib")
    @XmlElement(name = "IPITrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IpiTrib ipiTrib;

    @SerializedName("IPINT")
    @XmlElement(name = "IPINT", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IpiNt ipiNt;

    public String getcIEnq() {
        return cIEnq;
    }

    public void setcIEnq(String cIEnq) {
        this.cIEnq = cIEnq;
    }

    public String getCnpjProd() {
        return cnpjProd;
    }

    public void setCnpjProd(String cnpjProd) {
        this.cnpjProd = cnpjProd;
    }

    public String getcSelo() {
        return cSelo;
    }

    public void setcSelo(String cSelo) {
        this.cSelo = cSelo;
    }

    public String getqSelo() {
        return qSelo;
    }

    public void setqSelo(String qSelo) {
        this.qSelo = qSelo;
    }

    public String getcEnq() {
        return cEnq;
    }

    public void setcEnq(String cEnq) {
        this.cEnq = cEnq;
    }

    public IpiTrib getIpiTrib() {
        return ipiTrib;
    }

    public void setIpiTrib(IpiTrib ipiTrib) {
        this.ipiTrib = ipiTrib;
    }

    public IpiNt getIpiNt() {
        return ipiNt;
    }

    public void setIpiNt(IpiNt ipiNt) {
        this.ipiNt = ipiNt;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
