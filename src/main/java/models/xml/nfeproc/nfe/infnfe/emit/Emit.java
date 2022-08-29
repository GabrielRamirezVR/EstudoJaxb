package models.xml.nfeproc.nfe.infnfe.emit;

import com.google.gson.GsonBuilder;
import models.xml.nfeproc.nfe.infnfe.emit.enderemit.EnderEmit;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "emit", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emit")
public class Emit {

    @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cnpj;

    @XmlElement(name = "xNome", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xNome;

    @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String iE;

    @XmlElement(name = "CRT", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String crt;

    @XmlElement(name = "enderEmit", namespace = "http://www.portalfiscal.inf.br/nfe")
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

    public String getiE() {
        return iE;
    }

    public void setiE(String iE) {
        this.iE = iE;
    }

    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public EnderEmit getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(EnderEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
