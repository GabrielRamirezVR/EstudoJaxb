package models.xml.nfeproc.nfe.infnfe.det.imposto.cofins;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsaliq.CofinsAliq;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsnt.CofinsNT;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsoutr.CofinsOutr;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsqtde.CofinsQtde;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.cofinsst.CofinsST;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "COFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
public class Cofins {

    @SerializedName("COFINSAliq")
    @XmlElement(name = "COFINSAliq", namespace = "http://www.portalfiscal.inf.br/nfe")
    private CofinsAliq cofinsAliq;

    @SerializedName("COFINSQtde")
    @XmlElement(name = "COFINSQtde", namespace = "http://www.portalfiscal.inf.br/nfe")
    private CofinsQtde cofinsQtde;

    @SerializedName("COFINSNT")
    @XmlElement(name = "COFINSNT", namespace = "http://www.portalfiscal.inf.br/nfe")
    private CofinsNT cofinsNT;

    @SerializedName("COFINSOutr")
    @XmlElement(name = "COFINSOutr", namespace = "http://www.portalfiscal.inf.br/nfe")
    private CofinsOutr cofinsOutr;

    @SerializedName("COFINSST")
    @XmlElement(name = "COFINSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private CofinsST cofinsST;

    public CofinsAliq getCofinsAliq() {
        return cofinsAliq;
    }

    public void setCofinsAliq(CofinsAliq cofinsAliq) {
        this.cofinsAliq = cofinsAliq;
    }

    public CofinsQtde getCofinsQtde() {
        return cofinsQtde;
    }

    public void setCofinsQtde(CofinsQtde cofinsQtde) {
        this.cofinsQtde = cofinsQtde;
    }

    public CofinsNT getCofinsNT() {
        return cofinsNT;
    }

    public void setCofinsNT(CofinsNT cofinsNT) {
        this.cofinsNT = cofinsNT;
    }

    public CofinsOutr getCofinsOutr() {
        return cofinsOutr;
    }

    public void setCofinsOutr(CofinsOutr cofinsOutr) {
        this.cofinsOutr = cofinsOutr;
    }

    public CofinsST getCofinsST() {
        return cofinsST;
    }

    public void setCofinsST(CofinsST cofinsST) {
        this.cofinsST = cofinsST;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
