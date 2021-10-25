package hu.petrik.italoop;

/**
 * Aszu osztály, 1 attribútummal rendelkezik (int puttony), a Bor osztály gyermekosztálya
 */
public class Aszu extends Bor {
    /**
     * Hány puttonyos az aszu
     */
    private int puttony;

    /**
     * @param evjarat Aszu pédány évjáratának beállítása
     * @param puttony Aszu pédány puttony számának beállítása
     */
    public Aszu(int evjarat, int puttony) {
        super("aszu", evjarat);
        this.puttony = puttony;
    }

    /**
     * @return Puttony értékét visszaadja
     */
    public int getPuttony() {
        return puttony;
    }

    /**
     * @param puttony Puttony értékét beállítja/átállítja
     */
    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    /**
     * @return Aszu kiírásánál a kinézet beállítása
     */
    @Override
    public String toString() {
        return String.format(super.toString() + puttony + " puttonyos\n");
    }
}
