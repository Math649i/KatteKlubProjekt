package modelKlasser;

public class Bruger {

    private int brugerId;
    private String navn;
    private String kode;
    private int telefon;
    private String email;

    public int getBrugerId() {
        return brugerId;
    }

    public void setBrugerId(int brugerId) {
        this.brugerId = brugerId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bruger(int brugerId, String navn, String kode, int telefon, String email) {
        this.brugerId = brugerId;
        this.navn = navn;
        this.kode = kode;
        this.telefon = telefon;
        this.email = email;
    }
}
