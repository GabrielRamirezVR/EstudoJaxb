package models.xml.nfeproc.nfe.infnfe;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.avulsa.Avulsa;
import models.xml.nfeproc.nfe.infnfe.det.Det;
import models.xml.nfeproc.nfe.infnfe.emit.Emit;
import models.xml.nfeproc.nfe.infnfe.dest.Dest;
import models.xml.nfeproc.nfe.infnfe.ide.Ide;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = TagXml.INFNFE, namespace = TagXml.NAMESPACE)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = TagXml.INFNFE)
public class InfNfe {
    @SerializedName(TagXml.ID)
    @XmlAttribute(name = TagXml.ID)
    private String id;
    @XmlAttribute(name = TagXml.VERSAO)
    private String versao;

    @XmlElement(name = TagXml.IDE, namespace = TagXml.NAMESPACE)
    private Ide ide;

    @XmlElement(name = TagXml.EMIT, namespace = TagXml.NAMESPACE)
    private Emit emit;

    @XmlElement(name = TagXml.AVULSA, namespace = TagXml.NAMESPACE)
    private Avulsa avulsa;

    @XmlElement(name = TagXml.DEST, namespace = TagXml.NAMESPACE)
    private Dest dest;

    @XmlElement(name = TagXml.DET, namespace = TagXml.NAMESPACE)
    private List<Det> vDet;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Ide getIde() {
        return ide;
    }

    public void setIde(Ide ide) {
        this.ide = ide;
    }

    public List<Det> getvDet() {
        return vDet;
    }

    public void setvDet(List<Det> vDet) {
        this.vDet = vDet;
    }

    public Dest getDest() {
        return dest;
    }

    public void setDest(Dest dest) {
        this.dest = dest;
    }

    public Emit getEmit() {
        return emit;
    }

    public void setEmit(Emit emit) {
        this.emit = emit;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
