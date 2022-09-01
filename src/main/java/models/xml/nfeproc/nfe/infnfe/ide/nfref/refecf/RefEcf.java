package models.xml.nfeproc.nfe.infnfe.ide.nfref.refecf;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.ide.nfref.refnf.RefNf;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = TagXml.REFECF, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.REFECF, namespace = TagXml.NAMESPACE)
public class RefEcf {

    @XmlElement(name = TagXml.MOD, namespace = TagXml.NAMESPACE)
    private String mod;

    @SerializedName(TagXml.NECF)
    @XmlElement(name = TagXml.NECF, namespace = TagXml.NAMESPACE)
    private RefNf nEcf;

    @SerializedName(TagXml.NCOO)
    @XmlElement(name = TagXml.NCOO, namespace = TagXml.NAMESPACE)
    private RefNf nCoo;

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public RefNf getnEcf() {
        return nEcf;
    }

    public void setnEcf(RefNf nEcf) {
        this.nEcf = nEcf;
    }

    public RefNf getnCoo() {
        return nCoo;
    }

    public void setnCoo(RefNf nCoo) {
        this.nCoo = nCoo;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
