package models.xml.nfeproc.nfe.infnfe.ide.nfref.refnf;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.REFNF, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.REFNF, namespace = TagXml.NAMESPACE)
public class RefNf {

    @XmlElement(name = TagXml.CUF, namespace = TagXml.NAMESPACE)
    private String cUF;

    @SerializedName(TagXml.AAMM)
    @XmlElement(name = TagXml.AAMM, namespace = TagXml.NAMESPACE)
    private String aaMm;

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @XmlElement(name = TagXml.MOD, namespace = TagXml.NAMESPACE)
    private String mod;

    @XmlElement(name = TagXml.SERIE, namespace = TagXml.NAMESPACE)
    private String serie;

    @XmlElement(name = TagXml.NNF, namespace = TagXml.NAMESPACE)
    private String nNF;

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getAaMm() {
        return aaMm;
    }

    public void setAaMm(String aaMm) {
        this.aaMm = aaMm;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
