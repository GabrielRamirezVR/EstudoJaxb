package models.xml.nfeproc.nfe.infnfe;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import models.tags.TagXml;
import models.xml.nfeproc.nfe.infnfe.autxml.AutXml;
import models.xml.nfeproc.nfe.infnfe.avulsa.Avulsa;
import models.xml.nfeproc.nfe.infnfe.det.Det;
import models.xml.nfeproc.nfe.infnfe.emit.Emit;
import models.xml.nfeproc.nfe.infnfe.dest.Dest;
import models.xml.nfeproc.nfe.infnfe.entrega.Entrega;
import models.xml.nfeproc.nfe.infnfe.ide.Ide;
import models.xml.nfeproc.nfe.infnfe.retirada.Retirada;

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

    @XmlElement(name = TagXml.RETIRADA, namespace = TagXml.NAMESPACE)
    private Retirada retirada;

    @XmlElement(name = TagXml.ENTREGA, namespace = TagXml.NAMESPACE)
    private Entrega entrega;

    @SerializedName(TagXml.AUTXML)
    @XmlElement(name = TagXml.AUTXML, namespace = TagXml.NAMESPACE)
    private AutXml autXml;

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

    public Avulsa getAvulsa() {
        return avulsa;
    }

    public void setAvulsa(Avulsa avulsa) {
        this.avulsa = avulsa;
    }

    public Retirada getRetirada() {
        return retirada;
    }

    public void setRetirada(Retirada retirada) {
        this.retirada = retirada;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public AutXml getAutXml() {
        return autXml;
    }

    public void setAutXml(AutXml autXml) {
        this.autXml = autXml;
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
