package models.xml.nfeproc.nfe.infnfe.det.prod.di;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.DI, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.DI, namespace = TagXml.NAMESPACE)
public class Di {

    @SerializedName(TagXml.NDI)
    @XmlElement(name = TagXml.NDI, namespace = TagXml.NAMESPACE)
    private String nDi;

    @SerializedName(TagXml.DDI)
    @XmlElement(name = TagXml.DDI, namespace = TagXml.NAMESPACE)
    private String dDi;

    @SerializedName(TagXml.XLOCDESEMB)
    @XmlElement(name = TagXml.XLOCDESEMB, namespace = TagXml.NAMESPACE)
    private String xLocDesmb;

    @SerializedName(TagXml.UFDESEMB)
    @XmlElement(name = TagXml.UFDESEMB, namespace = TagXml.NAMESPACE)
    private String ufDesemb;

    @SerializedName(TagXml.DDESEMB)
    @XmlElement(name = TagXml.DDESEMB, namespace = TagXml.NAMESPACE)
    private String dDesemb;

    @SerializedName(TagXml.TPVIATRANSP)
    @XmlElement(name = TagXml.TPVIATRANSP, namespace = TagXml.NAMESPACE)
    private String tpViaTransp;

    @SerializedName(TagXml.VAFRMM)
    @XmlElement(name = TagXml.VAFRMM, namespace = TagXml.NAMESPACE)
    private String vAFRMM;

    @SerializedName(TagXml.TPINTERMEDIO)
    @XmlElement(name = TagXml.TPINTERMEDIO, namespace = TagXml.NAMESPACE)
    private String tpIntermedio;

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @SerializedName(TagXml.UFTERCEIRO)
    @XmlElement(name = TagXml.UFTERCEIRO, namespace = TagXml.NAMESPACE)
    private String ufTerceiro;

    @SerializedName(TagXml.CEXPORTADOR)
    @XmlElement(name = TagXml.CEXPORTADOR, namespace = TagXml.NAMESPACE)
    private String cExportador;

    public String getnDi() {
        return nDi;
    }

    public void setnDi(String nDi) {
        this.nDi = nDi;
    }

    public String getdDi() {
        return dDi;
    }

    public void setdDi(String dDi) {
        this.dDi = dDi;
    }

    public String getxLocDesmb() {
        return xLocDesmb;
    }

    public void setxLocDesmb(String xLocDesmb) {
        this.xLocDesmb = xLocDesmb;
    }

    public String getUfDesemb() {
        return ufDesemb;
    }

    public void setUfDesemb(String ufDesemb) {
        this.ufDesemb = ufDesemb;
    }

    public String getdDesemb() {
        return dDesemb;
    }

    public void setdDesemb(String dDesemb) {
        this.dDesemb = dDesemb;
    }

    public String getTpViaTransp() {
        return tpViaTransp;
    }

    public void setTpViaTransp(String tpViaTransp) {
        this.tpViaTransp = tpViaTransp;
    }

    public String getvAFRMM() {
        return vAFRMM;
    }

    public void setvAFRMM(String vAFRMM) {
        this.vAFRMM = vAFRMM;
    }

    public String getTpIntermedio() {
        return tpIntermedio;
    }

    public void setTpIntermedio(String tpIntermedio) {
        this.tpIntermedio = tpIntermedio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUfTerceiro() {
        return ufTerceiro;
    }

    public void setUfTerceiro(String ufTerceiro) {
        this.ufTerceiro = ufTerceiro;
    }

    public String getcExportador() {
        return cExportador;
    }

    public void setcExportador(String cExportador) {
        this.cExportador = cExportador;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
