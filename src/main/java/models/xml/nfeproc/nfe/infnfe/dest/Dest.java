package models.xml.nfeproc.nfe.infnfe.dest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.xml.nfeproc.nfe.infnfe.dest.enderdest.EnderDest;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "dest", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dest")
public class Dest {

    @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cnpj;

    @XmlElement(name = "xNome", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xNome;

    @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String iE;

    @XmlElement(name = "indIEDest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String indIeDest;

    @XmlElement(name = "email", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String email;

    @XmlElement(name = "enderDest", namespace = "http://www.portalfiscal.inf.br/nfe")
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

    public String getiE() {
        return iE;
    }

    public void setiE(String iE) {
        this.iE = iE;
    }

    public String getIndIeDest() {
        return indIeDest;
    }

    public void setIndIeDest(String indIeDest) {
        this.indIeDest = indIeDest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
