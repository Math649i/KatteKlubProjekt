package ModelKlasser;

public class Katte {
    private int id;
    private String navn;
    private String race;
    private int alder;
    private int vegt;
    private String fodselsdag;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getVegt() {
        return vegt;
    }

    public void setVegt(int vegt) {
        this.vegt = vegt;
    }

    public String getFodselsdag() {
        return fodselsdag;
    }

    public void setFodselsdag(String fodselsdag) {
        this.fodselsdag = fodselsdag;
    }

    public Katte(int id, String navn, String race, int alder, int vegt, String fodselsdag) {
        this.id = id;
        this.navn = navn;
        this.race = race;
        this.alder = alder;
        this.vegt = vegt;
        this.fodselsdag = fodselsdag;
    }


}
