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
     * @param evjarat
     * @param puttony
     */
    public Aszu(int evjarat, int puttony) {
        super("aszu", evjarat);
        this.puttony = puttony;
    }

    public int getPuttony() {
        return puttony;
    }

    public void setPuttony(int puttony) {
        this.puttony = puttony;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + puttony + " puttonyos\n");
    }
}
