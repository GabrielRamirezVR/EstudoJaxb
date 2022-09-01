package models.xml.nfeproc.nfe.infnfe.ide.nfref;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.ide.nfref.refNfp.RefNfp;
import models.xml.nfeproc.nfe.infnfe.ide.nfref.refecf.RefEcf;
import models.xml.nfeproc.nfe.infnfe.ide.nfref.refnf.RefNf;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.NFREF, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.NFREF, namespace = TagXml.NAMESPACE)
public class NfRef {

    @XmlElement(name = TagXml.REFNFE, namespace = TagXml.NAMESPACE)
    private String refNFe;

    @XmlElement(name = TagXml.REFNF, namespace = TagXml.NAMESPACE)
    private RefNf refNF;

    @SerializedName(TagXml.REFNFP)
    @XmlElement(name = TagXml.REFNFP, namespace = TagXml.NAMESPACE)
    private RefNfp refNFp;

    @SerializedName(TagXml.REFECF)
    @XmlElement(name = TagXml.REFECF, namespace = TagXml.NAMESPACE)
    private RefEcf refEcf;

    public String getRefNFe() {
        return refNFe;
    }

    public void setRefNFe(String refNFe) {
        this.refNFe = refNFe;
    }

    public RefNf getRefNF() {
        return refNF;
    }

    public void setRefNF(RefNf refNF) {
        this.refNF = refNF;
    }

    public RefNfp getRefNFp() {
        return refNFp;
    }

    public void setRefNFp(RefNfp refNFp) {
        this.refNFp = refNFp;
    }

    public RefEcf getRefEcf() {
        return refEcf;
    }

    public void setRefEcf(RefEcf refEcf) {
        this.refEcf = refEcf;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
