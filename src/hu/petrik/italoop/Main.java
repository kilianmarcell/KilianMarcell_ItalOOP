package hu.petrik.italoop;

public class Main {

    public static void main(String[] args) {

        Bor b = new Bor("Teszt Bor", 1154);
        Aszu a = new Aszu(1342, 6);

        Futtathato.kiirBor(a);
        Futtathato.kiirBor(b);
    }
}