package models.xml.nfeproc.nfe.infnfe.entrega;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.ENTREGA, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.ENTREGA, namespace = TagXml.NAMESPACE)
public class Entrega {

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @SerializedName(TagXml.CPF)
    @XmlElement(name = TagXml.CPF, namespace = TagXml.NAMESPACE)
    private String cpf;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
