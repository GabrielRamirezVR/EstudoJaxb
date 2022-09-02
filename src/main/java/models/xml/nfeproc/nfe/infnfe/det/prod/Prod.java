package models.xml.nfeproc.nfe.infnfe.det.prod;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.det.prod.di.Di;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.PROD, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.PROD, namespace = TagXml.NAMESPACE)
public class Prod {
    @SerializedName(TagXml.CPROD)
    @XmlElement(name = TagXml.CPROD, namespace = TagXml.NAMESPACE)
    private String cProd;

    @SerializedName(TagXml.CEAN)
    @XmlElement(name = TagXml.CEAN, namespace = TagXml.NAMESPACE)
    private String cEan;

    @SerializedName(TagXml.XPROD)
    @XmlElement(name = TagXml.XPROD, namespace = TagXml.NAMESPACE)
    private String xProd;

    @SerializedName(TagXml.NCM)
    @XmlElement(name = TagXml.NCM, namespace = TagXml.NAMESPACE)
    private String ncm;

    @SerializedName(TagXml.NVE)
    @XmlElement(name = TagXml.NVE, namespace = TagXml.NAMESPACE)
    private String nve;

    @SerializedName(TagXml.EXTIPI)
    @XmlElement(name = TagXml.EXTIPI, namespace = TagXml.NAMESPACE)
    private String exTipi;

    @SerializedName(TagXml.CFOP)
    @XmlElement(name = TagXml.CFOP, namespace = TagXml.NAMESPACE)
    private String cfop;

    @SerializedName(TagXml.UCOM)
    @XmlElement(name = TagXml.UCOM, namespace = TagXml.NAMESPACE)
    private String uCom;

    @SerializedName(TagXml.QCOM)
    @XmlElement(name = TagXml.QCOM, namespace = TagXml.NAMESPACE)
    private String qCom;

    @SerializedName(TagXml.VUNCOM)
    @XmlElement(name = TagXml.VUNCOM, namespace = TagXml.NAMESPACE)
    private String vUncom;

    @SerializedName(TagXml.VPROD)
    @XmlElement(name = TagXml.VPROD, namespace = TagXml.NAMESPACE)
    private String vProd;

    @SerializedName(TagXml.CEANTRIB)
    @XmlElement(name = TagXml.CEANTRIB, namespace = TagXml.NAMESPACE)
    private String cEanTrib;

    @SerializedName(TagXml.UTRIB)
    @XmlElement(name = TagXml.UTRIB, namespace = TagXml.NAMESPACE)
    private String uTrib;

    @SerializedName(TagXml.QTRIB)
    @XmlElement(name = TagXml.QTRIB, namespace = TagXml.NAMESPACE)
    private String qTrib;

    @SerializedName(TagXml.VUNTRIB)
    @XmlElement(name = TagXml.VUNTRIB, namespace = TagXml.NAMESPACE)
    private String vUnTrib;

    @SerializedName(TagXml.VFRETE)
    @XmlElement(name = TagXml.VFRETE, namespace = TagXml.NAMESPACE)
    private String vFrete;

    @SerializedName(TagXml.VSEG)
    @XmlElement(name = TagXml.VSEG, namespace = TagXml.NAMESPACE)
    private String vSeg;

    @SerializedName(TagXml.VDESC)
    @XmlElement(name = TagXml.VDESC, namespace = TagXml.NAMESPACE)
    private String vDesc;

    @SerializedName(TagXml.VOUTRO)
    @XmlElement(name = TagXml.VOUTRO, namespace = TagXml.NAMESPACE)
    private String vOutro;

    @SerializedName(TagXml.INDTOT)
    @XmlElement(name = TagXml.INDTOT, namespace = TagXml.NAMESPACE)
    private String indTot;

    @SerializedName(TagXml.DI)
    @XmlElement(name = TagXml.DI, namespace = TagXml.NAMESPACE)
    private Di di;

    public String getcProd() {
        return cProd;
    }

    public void setcProd(String cProd) {
        this.cProd = cProd;
    }

    public String getcEan() {
        return cEan;
    }

    public void setcEan(String cEan) {
        this.cEan = cEan;
    }

    public String getxProd() {
        return xProd;
    }

    public void setxProd(String xProd) {
        this.xProd = xProd;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getNve() {
        return nve;
    }

    public void setNve(String nve) {
        this.nve = nve;
    }

    public String getExTipi() {
        return exTipi;
    }

    public void setExTipi(String exTipi) {
        this.exTipi = exTipi;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getuCom() {
        return uCom;
    }

    public void setuCom(String uCom) {
        this.uCom = uCom;
    }

    public String getqCom() {
        return qCom;
    }

    public void setqCom(String qCom) {
        this.qCom = qCom;
    }

    public String getvUncom() {
        return vUncom;
    }

    public void setvUncom(String vUncom) {
        this.vUncom = vUncom;
    }

    public String getvProd() {
        return vProd;
    }

    public void setvProd(String vProd) {
        this.vProd = vProd;
    }

    public String getcEanTrib() {
        return cEanTrib;
    }

    public void setcEanTrib(String cEanTrib) {
        this.cEanTrib = cEanTrib;
    }

    public String getuTrib() {
        return uTrib;
    }

    public void setuTrib(String uTrib) {
        this.uTrib = uTrib;
    }

    public String getqTrib() {
        return qTrib;
    }

    public void setqTrib(String qTrib) {
        this.qTrib = qTrib;
    }

    public String getvUnTrib() {
        return vUnTrib;
    }

    public void setvUnTrib(String vUnTrib) {
        this.vUnTrib = vUnTrib;
    }

    public String getvFrete() {
        return vFrete;
    }

    public void setvFrete(String vFrete) {
        this.vFrete = vFrete;
    }

    public String getvSeg() {
        return vSeg;
    }

    public void setvSeg(String vSeg) {
        this.vSeg = vSeg;
    }

    public String getvDesc() {
        return vDesc;
    }

    public void setvDesc(String vDesc) {
        this.vDesc = vDesc;
    }

    public String getvOutro() {
        return vOutro;
    }

    public void setvOutro(String vOutro) {
        this.vOutro = vOutro;
    }

    public String getIndTot() {
        return indTot;
    }

    public void setIndTot(String indTot) {
        this.indTot = indTot;
    }

    public Di getDi() {
        return di;
    }

    public void setDi(Di di) {
        this.di = di;
    }

    @Override
    public String toString()  {
        return new Gson().toJson(this);
    }
}
