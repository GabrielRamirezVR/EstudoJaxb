package models.xml.nfeproc.nfe.infnfe.emit.enderemit;

import com.google.gson.GsonBuilder;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "enderEmit", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enderEmit")
public class EnderEmit {

    @XmlElement(name = "xLgr", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xLgr;

    @XmlElement(name = "nro", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String nro;

    @XmlElement(name = "xBairro", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xBairro;

    @XmlElement(name = "cMun", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cMun;

    @XmlElement(name = "xMun", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xMun;

    @XmlElement(name = "UF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String uF;

    @XmlElement(name = "CEP", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cep;

    @XmlElement(name = "cPais", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String cPais;

    @XmlElement(name = "xPais", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String xPais;

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

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
