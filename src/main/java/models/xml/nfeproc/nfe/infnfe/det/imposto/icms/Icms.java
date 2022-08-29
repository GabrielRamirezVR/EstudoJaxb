package models.xml.nfeproc.nfe.infnfe.det.imposto.icms;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;


import javax.xml.bind.annotation.*;

@XmlRootElement(name = "ICMS", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICMS")
public class Icms {

    @SerializedName("ICMS00")
    @XmlElement(name = "ICMS00", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms00 icms00;

    @SerializedName("ICMS10")
    @XmlElement(name = "ICMS10", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms10 icms10;

    @SerializedName("ICMS20")
    @XmlElement(name = "ICMS20", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms20 icms20;

    @SerializedName("ICMS30")
    @XmlElement(name = "ICMS30", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms30 icms30;

    @SerializedName("ICMS40")
    @XmlElement(name = "ICMS40", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms40 icms40;

    @SerializedName("ICMS61")
    @XmlElement(name = "ICMS51", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms51 icms51;

    @SerializedName("ICMS60")
    @XmlElement(name = "ICMS60", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms60 icms60;

    @SerializedName("ICMS70")
    @XmlElement(name = "ICMS70", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms70 icms70;

    @SerializedName("ICMS90")
    @XmlElement(name = "ICMS90", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Icms90 icms90;

    @SerializedName("ICMSPart")
    @XmlElement(name = "ICMSPart", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsPart icmsPart;

    @SerializedName("ICMSSN101")
    @XmlElement(name = "ICMSSN101", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn101 icmsSn101;

    @SerializedName("ICMSSN102")
    @XmlElement(name = "ICMSSN102", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn102 icmsSn102;

    @SerializedName("ICMSSN201")
    @XmlElement(name = "ICMSSN201", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn201 icmsSn201;

    @SerializedName("ICMSSN202")
    @XmlElement(name = "ICMSSN202", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn202 icmsSn202;

    @SerializedName("ICMSSN500")
    @XmlElement(name = "ICMSSN500", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn500 icmsSn500;

    @SerializedName("ICMSSN900")
    @XmlElement(name = "ICMSSN900", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSn900 icmsSn900;

    @SerializedName("ICMSST")
    @XmlElement(name = "ICMSST", namespace = "http://www.portalfiscal.inf.br/nfe")
    private IcmsSt icmsSt;

    public Icms00 getIcms00() {
        return icms00;
    }

    public void setIcms00(Icms00 icms00) {
        this.icms00 = icms00;
    }

    public Icms10 getIcms10() {
        return icms10;
    }

    public void setIcms10(Icms10 icms10) {
        this.icms10 = icms10;
    }

    public Icms20 getIcms20() {
        return icms20;
    }

    public void setIcms20(Icms20 icms20) {
        this.icms20 = icms20;
    }

    public Icms30 getIcms30() {
        return icms30;
    }

    public void setIcms30(Icms30 icms30) {
        this.icms30 = icms30;
    }

    public Icms40 getIcms40() {
        return icms40;
    }

    public void setIcms40(Icms40 icms40) {
        this.icms40 = icms40;
    }

    public Icms51 getIcms51() {
        return icms51;
    }

    public void setIcms51(Icms51 icms51) {
        this.icms51 = icms51;
    }

    public Icms60 getIcms60() {
        return icms60;
    }

    public void setIcms60(Icms60 icms60) {
        this.icms60 = icms60;
    }

    public Icms70 getIcms70() {
        return icms70;
    }

    public void setIcms70(Icms70 icms70) {
        this.icms70 = icms70;
    }

    public Icms90 getIcms90() {
        return icms90;
    }

    public void setIcms90(Icms90 icms90) {
        this.icms90 = icms90;
    }

    public IcmsPart getIcmsPart() {
        return icmsPart;
    }

    public void setIcmsPart(IcmsPart icmsPart) {
        this.icmsPart = icmsPart;
    }

    public IcmsSn101 getIcmsSn101() {
        return icmsSn101;
    }

    public void setIcmsSn101(IcmsSn101 icmsSn101) {
        this.icmsSn101 = icmsSn101;
    }

    public IcmsSn102 getIcmsSn102() {
        return icmsSn102;
    }

    public void setIcmsSn102(IcmsSn102 icmsSn102) {
        this.icmsSn102 = icmsSn102;
    }

    public IcmsSn201 getIcmsSn201() {
        return icmsSn201;
    }

    public void setIcmsSn201(IcmsSn201 icmsSn201) {
        this.icmsSn201 = icmsSn201;
    }

    public IcmsSn202 getIcmsSn202() {
        return icmsSn202;
    }

    public void setIcmsSn202(IcmsSn202 icmsSn202) {
        this.icmsSn202 = icmsSn202;
    }

    public IcmsSn500 getIcmsSn500() {
        return icmsSn500;
    }

    public void setIcmsSn500(IcmsSn500 icmsSn500) {
        this.icmsSn500 = icmsSn500;
    }

    public IcmsSn900 getIcmsSn900() {
        return icmsSn900;
    }

    public void setIcmsSn900(IcmsSn900 icmsSn900) {
        this.icmsSn900 = icmsSn900;
    }

    public IcmsSt getIcmsSt() {
        return icmsSt;
    }

    public void setIcmsSt(IcmsSt icmsSt) {
        this.icmsSt = icmsSt;
    }

    @Override
    public String toString() {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
