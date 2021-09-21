public class Tyre {
    private  String tyreName;
    private int sie;

    public Tyre(String tyreName, int sie) {
        this.tyreName = tyreName;
        this.sie = sie;
    }

    public String getTyreName() {
        return tyreName;
    }

    public int getSie() {
        return sie;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public void setSie(int sie) {
        this.sie = sie;
    }
}
