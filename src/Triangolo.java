public class Triangolo implements Forma {
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcolaArea() {
        int areaT = (base * altezza) / 2;
        return areaT;
    }
}

