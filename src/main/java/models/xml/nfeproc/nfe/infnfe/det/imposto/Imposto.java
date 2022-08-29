package models.xml.nfeproc.nfe.infnfe.det.imposto;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import models.xml.nfeproc.nfe.infnfe.det.imposto.cofins.Cofins;
import models.xml.nfeproc.nfe.infnfe.det.imposto.icms.Icms;
import models.xml.nfeproc.nfe.infnfe.det.imposto.ii.Ii;
import models.xml.nfeproc.nfe.infnfe.det.imposto.ipi.Ipi;
import models.xml.nfeproc.nfe.infnfe.det.imposto.pis.Pis;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "imposto", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imposto")
public class Imposto {

    @XmlElement(name = "vTotTrib", namespace = "http://www.portalfiscal.inf.br/nfe")
    private String vTotTrib;

    @SerializedName("ICMS")
    @XmlElement(name = "ICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms icms;

    @SerializedName("IPI")
    @XmlElement(name = "IPI", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Ipi ipi;

    @SerializedName("II")
    @XmlElement(name = "II", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Ii ii;

    @SerializedName("PIS")
    @XmlElement(name = "PIS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Pis pis;

    @SerializedName("COFINS")
    @XmlElement(name = "COFINS", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Cofins cofins;

    public String getvTotTrib() {
        return vTotTrib;
    }

    public void setvTotTrib(String vTotTrib) {
        this.vTotTrib = vTotTrib;
    }

    public Icms getIcms() {
        return icms;
    }

    public void setIcms(Icms icms) {
        this.icms = icms;
    }

    public Ipi getIpi() {
        return ipi;
    }

    public void setIpi(Ipi ipi) {
        this.ipi = ipi;
    }

    public Ii getIi() {
        return ii;
    }

    public void setIi(Ii ii) {
        this.ii = ii;
    }

    public Pis getPis() {
        return pis;
    }

    public void setPis(Pis pis) {
        this.pis = pis;
    }

    public Cofins getCofins() {
        return cofins;
    }

    public void setCofins(Cofins cofins) {
        this.cofins = cofins;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
