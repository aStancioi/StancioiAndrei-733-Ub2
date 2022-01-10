package Model;

public class Produkt {
    // Produkt (Name, Preis, SKU, Initiale Anzahl Produkte am Lager)

    private String name, sku;
    private float preis;
    private int anzahlProdukte;

    public Produkt(String name, String sku, float preis, int anzahlProdukte) {
        this.name = name;
        this.sku = sku;
        this.preis = preis;
        this.anzahlProdukte = anzahlProdukte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public int getAnzahlProdukte() {
        return anzahlProdukte;
    }

    public void setAnzahlProdukte(int anzahlProdukte) {
        this.anzahlProdukte = anzahlProdukte;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", sku='" + sku + '\'' +
                ", preis=" + preis +
                ", anzahlProdukte=" + anzahlProdukte +
                '}';
    }
}
