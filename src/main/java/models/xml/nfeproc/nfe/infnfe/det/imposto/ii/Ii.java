package models.xml.nfeproc.nfe.infnfe.det.imposto.ii;

import com.google.gson.Gson;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "II", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "II", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Ii {

    @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vBC;

    @XmlElement(name = "vDespAdu", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vDespAdu;

    @XmlElement(name = "vII", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vII;

    @XmlElement(name = "vIOF", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vIOF;

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getvDespAdu() {
        return vDespAdu;
    }

    public void setvDespAdu(String vDespAdu) {
        this.vDespAdu = vDespAdu;
    }

    public String getvII() {
        return vII;
    }

    public void setvII(String vII) {
        this.vII = vII;
    }

    public String getvIOF() {
        return vIOF;
    }

    public void setvIOF(String vIOF) {
        this.vIOF = vIOF;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
