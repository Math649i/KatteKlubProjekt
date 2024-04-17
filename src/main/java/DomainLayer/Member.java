package DomainLayer;

import jakarta.persistence.*;


@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medlemsId;

    private String navn;
    private String email;
    private String password;
    private String adresse;
    private String telefonnummer;

    // Standard getters and setters
    public Long getMedlemsId() {
        return medlemsId;
    }

    public void setMedlemsId(Long medlemsId) {
        this.medlemsId = medlemsId;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
