package models.xml.nfeproc.nfe.infnfe.avulsa;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.AVULSA, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.AVULSA, namespace = TagXml.NAMESPACE)
public class Avulsa {

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @XmlElement(name = TagXml.XORGAO, namespace = TagXml.NAMESPACE)
    private String xOrgao;

    @XmlElement(name = TagXml.MATR, namespace = TagXml.NAMESPACE)
    private String matr;

    @XmlElement(name = TagXml.XAGENTE, namespace = TagXml.NAMESPACE)
    private String xAgente;

    @XmlElement(name = TagXml.FONE, namespace = TagXml.NAMESPACE)
    private String fone;

    @SerializedName(TagXml.UF)
    @XmlElement(name = TagXml.UF, namespace = TagXml.NAMESPACE)
    private String uf;

    @SerializedName(TagXml.NDAR)
    @XmlElement(name = TagXml.NDAR, namespace = TagXml.NAMESPACE)
    private String nDar;

    @XmlElement(name = TagXml.DEMI, namespace = TagXml.NAMESPACE)
    private String dEmi;

    @SerializedName(TagXml.VDAR)
    @XmlElement(name = TagXml.VDAR, namespace = TagXml.NAMESPACE)
    private String vDar;

    @XmlElement(name = TagXml.REPEMI, namespace = TagXml.NAMESPACE)
    private String repEmi;

    @XmlElement(name = TagXml.DPAG, namespace = TagXml.NAMESPACE)
    private String dPag;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getxOrgao() {
        return xOrgao;
    }

    public void setxOrgao(String xOrgao) {
        this.xOrgao = xOrgao;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getxAgente() {
        return xAgente;
    }

    public void setxAgente(String xAgente) {
        this.xAgente = xAgente;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getnDar() {
        return nDar;
    }

    public void setnDar(String nDar) {
        this.nDar = nDar;
    }

    public String getdEmi() {
        return dEmi;
    }

    public void setdEmi(String dEmi) {
        this.dEmi = dEmi;
    }

    public String getvDar() {
        return vDar;
    }

    public void setvDar(String vDar) {
        this.vDar = vDar;
    }

    public String getRepEmi() {
        return repEmi;
    }

    public void setRepEmi(String repEmi) {
        this.repEmi = repEmi;
    }

    public String getdPag() {
        return dPag;
    }

    public void setdPag(String dPag) {
        this.dPag = dPag;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
