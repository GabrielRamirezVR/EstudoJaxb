package models.xml.nfeproc.nfe.infnfe.autxml;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.AUTXML, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.AUTXML, namespace = TagXml.NAMESPACE)
public class AutXml {

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @SerializedName(TagXml.CPF)
    @XmlElement(name = TagXml.CPF, namespace = TagXml.NAMESPACE)
    private String cpf;

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

    @Override
    public String toString()  {
        return new Gson().toJson(this);
    }
}
