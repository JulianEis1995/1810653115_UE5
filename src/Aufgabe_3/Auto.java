package Aufgabe_3;

public class Auto extends Fahrzeug implements Comparable<Auto>
{
    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen, String farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe, ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }

    //Getter and Setter
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    @Override
    public String toString()
    {
        return "Mein Auto hat " + getPs() + " und fährt mit " + getGeschwindigkeit() + " km/h";
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    //Sonstige Methoden
    public void klimaanlageAn()
    {
        setKlimaanlage(true);
    }

    public void klimaanlageAus()
    {
        setKlimaanlage(false);
    }

    @Override

    // gleiche PS - selbe Ebene (Sortierung dann nach Liste
    // mehr PS - über dem letzen Auto
    // weniger PS - unter dem letzten Auto
    public int compareTo(Auto a)
    {
        if (this.getPs() == a.getPs())
        {
            return 0;
        } else if (this.getPs() > a.getPs())
        {
            return 1;
        } else {
            return -1;
        }
    }
}
