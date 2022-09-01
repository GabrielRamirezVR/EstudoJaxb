package models.xml.nfeproc.nfe.infnfe.emit;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.emit.enderemit.EnderEmit;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.EMIT, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.EMIT)
public class Emit {

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @SerializedName(TagXml.CPF)
    @XmlElement(name = TagXml.CPF, namespace = TagXml.NAMESPACE)
    private String cpf;

    @XmlElement(name = TagXml.XNOME, namespace = TagXml.NAMESPACE)
    private String xNome;

    @XmlElement(name = TagXml.XFANT, namespace = TagXml.NAMESPACE)
    private String xFant;

    @XmlElement(name = TagXml.ENDEREMIT, namespace = TagXml.NAMESPACE)
    private EnderEmit enderEmit;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public EnderEmit getEnderEmit() {
        return enderEmit;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public void setEnderEmit(EnderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
