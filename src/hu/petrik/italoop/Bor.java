package hu.petrik.italoop;

/**
 * Bor osztály, 2 attribútummal rendelkezik (String fajta és int evjarat)
 */
public class Bor {
    /**
     * Bor neve
     */
    private String fajta;
    /**
     * Bor évjárata
     */
    private int evjarat = 0;

    /**
     * @param fajta Bor példány nevének beállítása
     * @param evjarat Bor példány évjáratának beállítása
     */
    public Bor(String fajta, int evjarat) {
        this.fajta = fajta;
        this.evjarat = evjarat;
    }

    /**
     * @return Bor nevét Visszaadja
     */
    public String getFajta() {
        return fajta;
    }

    /**
     * @return Bor évjáratát Visszaadja
     */
    public int getEvjarat() {
        return evjarat;
    }

    /**
     * @param fajta Bor nevét beállítja
     */
    public void setFajta(String fajta) {
        this.fajta = fajta;
    }

    /**
     * @param evjarat Bor évjáratát beállítja
     */
    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    /**
     * @return Bor kiírásánál a kinézet beállítása
     */
    @Override
    public String toString() {
        return String.format("Bor fajtája: %s\nBor évjárata: %d\n", fajta, evjarat);
    }
}