public abstract class hewan {
    private int umur;

    protected hewan () {
        this.umur = 0;
    }

    public void bertambahUmur() {
        this.umur += 1;
    }

    public abstract void bergerak ();
}
