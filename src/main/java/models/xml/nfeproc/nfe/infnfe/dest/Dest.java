package models.xml.nfeproc.nfe.infnfe.dest;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.dest.enderdest.EnderDest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.DEST, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.DEST)
public class Dest {

    @SerializedName(TagXml.CNPJ)
    @XmlElement(name = TagXml.CNPJ, namespace = TagXml.NAMESPACE)
    private String cnpj;

    @SerializedName(TagXml.CPF)
    @XmlElement(name = TagXml.CPF, namespace = TagXml.NAMESPACE)
    private String cpf;

    @XmlElement(name = TagXml.XNOME, namespace = TagXml.NAMESPACE)
    private String xNome;

    @XmlElement(name = TagXml.IDESTRANGEIRO, namespace = TagXml.NAMESPACE)
    private String idEstrangeiro;

    @XmlElement(name = TagXml.ENDERDEST, namespace = TagXml.NAMESPACE)
    private EnderDest enderDest;

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

    public EnderDest getEnderDest() {
        return enderDest;
    }

    public void setEnderDest(EnderDest enderDest) {
        this.enderDest = enderDest;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdEstrangeiro() {
        return idEstrangeiro;
    }

    public void setIdEstrangeiro(String idEstrangeiro) {
        this.idEstrangeiro = idEstrangeiro;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
