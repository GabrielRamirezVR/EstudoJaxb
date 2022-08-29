package models.xml.nfeproc.nfe.infnfe;

import com.google.gson.GsonBuilder;
import models.xml.nfeproc.nfe.infnfe.det.Det;
import models.xml.nfeproc.nfe.infnfe.emit.Emit;
import models.xml.nfeproc.nfe.infnfe.dest.Dest;
import models.xml.nfeproc.nfe.infnfe.ide.Ide;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "infNFe", namespace = "http://www.portalfiscal.inf.br/nfe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infNFe")
public class InfNfe {
    @XmlAttribute(name = "Id")
    private String Id;
    @XmlAttribute(name = "versao")
    private String versao;

    @XmlElement(name = "ide", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Ide ide;

    @XmlElement(name = "emit", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Emit emit;

    @XmlElement(name = "dest", namespace = "http://www.portalfiscal.inf.br/nfe")
    private Dest dest;

    @XmlElement(name = "det", namespace = "http://www.portalfiscal.inf.br/nfe")
    private List<Det> vDet;


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
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
