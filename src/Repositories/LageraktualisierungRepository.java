package Repositories;

import Model.Lageraktualisierung;
import Model.Produkt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LageraktualisierungRepository {
    //CRUD - Console View
    private List<Lageraktualisierung> lageraktualisierungen;

    public LageraktualisierungRepository() {
        lageraktualisierungen = new ArrayList<>();
    }

    public List<Lageraktualisierung> getLageraktualisierungen() {
        return lageraktualisierungen;
    }

    private boolean contains(Lageraktualisierung lageraktualisierung) {
        if(!lageraktualisierungen.isEmpty()) {
            for (Lageraktualisierung akt : lageraktualisierungen) {
                if (lageraktualisierung.getDatum() == akt.getDatum()) {
                    return true;
                }
            }
        }
        return false;
    }

    public Lageraktualisierung addOne(Date datum, List<Produkt> produkte) {
        Lageraktualisierung lageraktualisierung = new Lageraktualisierung(datum, produkte);
        if(!contains(lageraktualisierung)) {
            lageraktualisierungen.add(lageraktualisierung);
        }
        return null;
    }

    public Lageraktualisierung deleteOne(int index) {
        if(!lageraktualisierungen.isEmpty()) {
            if(index >= 0 && index < lageraktualisierungen.size()) {
                Lageraktualisierung lageraktualisierung = lageraktualisierungen.get(index);
                lageraktualisierungen.remove(index);
                return lageraktualisierung;
            }
        }
        return null;
    }

    public Lageraktualisierung getByIndex(int index) {
        if(!lageraktualisierungen.isEmpty() && index >= 0 && index < lageraktualisierungen.size()) {
            return lageraktualisierungen.get(index);
        }
        return null;
    }

    public Lageraktualisierung getByDate(Date datum) {
        if(!lageraktualisierungen.isEmpty()) {
            for(Lageraktualisierung lageraktualisierung : lageraktualisierungen) {
                if(lageraktualisierung.getDatum() == datum) {
                    return lageraktualisierung;
                }
            }
        }
        return null;
    }
}
