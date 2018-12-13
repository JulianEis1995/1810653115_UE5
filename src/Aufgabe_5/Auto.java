package Aufgabe_5;

public class Auto extends Fahrzeug
{
    private boolean klimaanlage;
    private short airbags;

    public Auto(short reifen, Color farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe, ps, tueren);
        klimaanlage = false;
        this.airbags = airbags;
    }

    //Getter and Setter
    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    @Override
    public String toString()
    {
        return "Farbe des Wagens: " + getFarbe();
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
}
