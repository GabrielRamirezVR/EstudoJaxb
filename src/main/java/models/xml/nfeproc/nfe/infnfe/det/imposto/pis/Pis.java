package models.xml.nfeproc.nfe.infnfe.det.imposto.pis;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisaliq.PisAliq;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisnt.PisNT;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisoutr.PisOutr;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisqtde.PisQtde;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.pisst.PisST;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PIS", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIS", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Pis {

    @SerializedName("PISAliq")
    @XmlElement(name = "PISAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
    private PisAliq pisAliq;

    @SerializedName("PISQtde")
    @XmlElement(name = "PISQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
    private PisQtde pisQtde;

    @SerializedName("PISNT")
    @XmlElement(name = "PISNT", namespace = "http://www.portalfiscal.inf.br/nfe")
    private PisNT pisNT;

    @SerializedName("PISOutr")
    @XmlElement(name = "PISOutr", namespace = "http://www.portalfiscal.inf.br/nfe")
    private PisOutr pisOutr;

    @SerializedName("PISST")
    @XmlElement(name = "PISST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private PisST pisST;

    public PisAliq getPisAliq() {
        return pisAliq;
    }

    public void setPisAliq(PisAliq pisAliq) {
        this.pisAliq = pisAliq;
    }

    public PisQtde getPisQtde() {
        return pisQtde;
    }

    public void setPisQtde(PisQtde pisQtde) {
        this.pisQtde = pisQtde;
    }

    public PisNT getPisNT() {
        return pisNT;
    }

    public void setPisNT(PisNT pisNT) {
        this.pisNT = pisNT;
    }

    public PisOutr getPisOutr() {
        return pisOutr;
    }

    public void setPisOutr(PisOutr pisOutr) {
        this.pisOutr = pisOutr;
    }

    public PisST getPisST() {
        return pisST;
    }

    public void setPisST(PisST pisST) {
        this.pisST = pisST;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
