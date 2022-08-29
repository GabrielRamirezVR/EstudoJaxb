package models.xml;

import com.google.gson.GsonBuilder;
import models.xml.nfeproc.NfeProc;
import models.xml.nfeproc.nfe.infnfe.InfNfe;
import models.xml.nfeproc.nfe.infnfe.dest.Dest;
import models.xml.nfeproc.nfe.infnfe.det.Det;
import models.xml.nfeproc.nfe.infnfe.emit.Emit;
import models.xml.nfeproc.nfe.infnfe.ide.Ide;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name= "models/xml", propOrder = {"nfeProc"})
@XmlRootElement(name = "models/xml")
public class Xml {
    @XmlElement(name = "nfeProc", namespace = "http://www.portalfiscal.inf.br/nfe")
    private NfeProc nfeProc;

    public NfeProc getNfeProc() {
        return nfeProc;
    }

    public void setNfeProc(NfeProc nfeProc) {
        this.nfeProc = nfeProc;
    }

    public InfNfe getInfNfe() {
        return nfeProc.getNfe().getInfNfe();
    }

    public List<Det> getvDet() {
        return nfeProc.getNfe().getInfNfe().getvDet();
    }

    public Emit getEmit() {
        return nfeProc.getNfe().getInfNfe().getEmit();
    }

    public Dest getDest() {
        return nfeProc.getNfe().getInfNfe().getDest();
    }

    public Ide getIde() {
        return nfeProc.getNfe().getInfNfe().getIde();
    }

    @Override
    public String toString()  {
        return new GsonBuilder().setPrettyPrinting().create().toJson(this);
    }
}
