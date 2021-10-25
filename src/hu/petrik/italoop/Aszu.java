package hu.petrik.italoop;

public class Aszu extends Bor {
    private int puttony;

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
