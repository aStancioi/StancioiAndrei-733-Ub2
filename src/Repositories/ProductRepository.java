package Repositories;


import Model.Produkt;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    //CRUD-Console View
    private List<Produkt> produkte;

    public ProductRepository() {
        produkte = new ArrayList<>();
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public Produkt findByIndex(int index) {
        if(!produkte.isEmpty()) {
            if (index >= 0 && index < produkte.size()) {
                return produkte.get(index);
            }
        }
        return null;
    }

    private boolean contains(Produkt isIt) {
        if(!produkte.isEmpty()) {
            for (Produkt produkt : produkte) {
                if (produkt.getName().equals(isIt.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    private Produkt findByName(String name) {
        for (Produkt produkt : produkte) {
            if(produkt.getName().equals(name)) {
                return produkt;
            }
        }
        return null;
    }

    private Produkt findByPreis(String preis) {
        for (Produkt produkt : produkte) {
            if(String.valueOf(produkt.getPreis()).equals(preis)) {
                return produkt;
            }
        }
        return null;
    }

    private Produkt findBySku(String sku) {
        for (Produkt produkt : produkte) {
            if(produkt.getSku().equals(sku)) {
                return produkt;
            }
        }
        return null;
    }

    private Produkt findByAnzahl(String anzahl) {
        for(Produkt produkt : produkte) {
            if(String.valueOf(produkt.getAnzahlProdukte()).equals(String.valueOf(anzahl))) {
                return produkt;
            }
        }
        return null;
    }

    public Produkt addProdukt(String name, float preis, String sku, int anzahlProdukte) {
        if(!name.equals("") && !sku.equals("")) {
            Produkt neueProdukt = new Produkt(name, sku, preis, anzahlProdukte);
            if(!contains(neueProdukt)) {
                produkte.add(neueProdukt);
            }
            return neueProdukt;
        }

        return null;
    }

    public Produkt deleteProdukt(int index) {
        if(!produkte.isEmpty()) {
            if (index >= 0 && index < produkte.size()) {
                Produkt produkt = produkte.get(index);
                produkte.remove(index);
                return produkt;
            }
        }
        return null;
    }

    public Produkt getProdukt(String category) {
        Produkt preis = null;
        if(!produkte.isEmpty()) {
            Produkt name = findByName(category), anzahl = findByAnzahl(category), sku = findBySku(category);
            preis = findByPreis(category);
            if (name != null) {
                return name;
            }
            if (anzahl != null) {
                return anzahl;
            }
            if (sku != null) {
                return sku;
            }
        }
        return preis;
    }
}
