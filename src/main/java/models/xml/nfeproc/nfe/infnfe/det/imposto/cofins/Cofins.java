package models.xml.nfeproc.nfe.infnfe.det.imposto.cofins;

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
}
