package Model;

import java.util.Date;
import java.util.List;

public class Lageraktualisierung {
    //  Lageraktualisierung (datum, liste von Produkte mit Anzahl)
    Date datum;
    List<String> produktMitAnzahl;
    List<Produkt> produkte;

    public Lageraktualisierung(Date datum, List<Produkt> produkte) {
        this.datum = datum;
        this.produkte = produkte;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public List<String> getProduktMitAnzahl() {
        return produktMitAnzahl;
    }
}
