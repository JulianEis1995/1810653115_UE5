package Aufgabe_2;

public class Student extends Mensch
{
    //Attribute
    private int matrikelnummer;
    private String studiengang;

    //Getter und Setter
    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    //Konstruktor
    public Student(String vorname, String nachname, int alter, int matrikelnummer, String studiengang)
    {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public String status()
    {
        return "Es handelt sich um einen Student! " + getVorname() + " " + getNachname() + " und ist " + getAlter() +
                " Jahre alt und Zusätzlich hat der folgende Matrikelnummer: " + getMatrikelnummer() + " und folgenden Studiengang gewählt: "  + getStudiengang();
    }

}
