package models.xml.nfeproc.nfe.infnfe.emit.enderemit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.ENDEREMIT, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.ENDEREMIT, namespace = TagXml.NAMESPACE)
public class EnderEmit {

    @XmlElement(name = TagXml.XLGR, namespace = TagXml.NAMESPACE)
    private String xLgr;

    @XmlElement(name = TagXml.NRO, namespace = TagXml.NAMESPACE)
    private String nro;

    @XmlElement(name = TagXml.XCPL, namespace = TagXml.NAMESPACE)
    private String xCpl;

    @XmlElement(name = TagXml.XBAIRRO, namespace = TagXml.NAMESPACE)
    private String xBairro;

    @XmlElement(name = TagXml.CMUN, namespace = TagXml.NAMESPACE)
    private String cMun;

    @XmlElement(name = TagXml.XMUN, namespace = TagXml.NAMESPACE)
    private String xMun;

    @SerializedName(TagXml.UF)
    @XmlElement(name = TagXml.UF, namespace = TagXml.NAMESPACE)
    private String uF;

    @SerializedName(TagXml.CEP)
    @XmlElement(name = TagXml.CEP, namespace = TagXml.NAMESPACE)
    private String cep;

    @XmlElement(name = TagXml.CPAIS, namespace = TagXml.NAMESPACE)
    private String cPais;

    @XmlElement(name = TagXml.XPAIS, namespace = TagXml.NAMESPACE)
    private String xPais;

    @XmlElement(name = TagXml.FONE, namespace = TagXml.NAMESPACE)
    private String fone;

    @SerializedName(TagXml.IE)
    @XmlElement(name = TagXml.IE, namespace = TagXml.NAMESPACE)
    private String ie;

    @SerializedName(TagXml.IEST)
    @XmlElement(name = TagXml.IEST, namespace = TagXml.NAMESPACE)
    private String iest;

    @SerializedName(TagXml.IM)
    @XmlElement(name = TagXml.IM, namespace = TagXml.NAMESPACE)
    private String im;

    @SerializedName(TagXml.CNAE)
    @XmlElement(name = TagXml.CNAE, namespace = TagXml.NAMESPACE)
    private String cnae;

    @SerializedName(TagXml.CRT)
    @XmlElement(name = TagXml.CRT, namespace = TagXml.NAMESPACE)
    private String crt;

    public String getxLgr() {
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    public String getxBairro() {
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public String getcMun() {
        return cMun;
    }

    public void setcMun(String cMun) {
        this.cMun = cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public String getuF() {
        return uF;
    }

    public void setuF(String uF) {
        this.uF = uF;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getcPais() {
        return cPais;
    }

    public void setcPais(String cPais) {
        this.cPais = cPais;
    }

    public String getxPais() {
        return xPais;
    }

    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIest() {
        return iest;
    }

    public void setIest(String iest) {
        this.iest = iest;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
