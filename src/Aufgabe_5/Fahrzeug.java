package Aufgabe_5;

public class Fahrzeug
{
    private Color farbe;
    private short reifen;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    private static int anzahl;


    //Getter and Setter
    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }

    //Sonstige Methoden
    public void starten()
    {
        setGestartet(true);
    }

    public void stoppen()
    {
        setGestartet(false);
    }

    public void beschleunigen (short geschwindigkeit)
    {
        if(isGestartet())
        {
            int temp = (getGeschwindigkeit() + geschwindigkeit);
            if(temp <= 250)
            {
                this.geschwindigkeit += geschwindigkeit;
            }
            else
            {
                setGeschwindigkeit((short)250);
            }
        }

    }
    public void bremsen (short geschwindigkeit)
    {
        if(isGestartet())
        {
            int temp = (getGeschwindigkeit() - geschwindigkeit);
            if(temp >= 0)
            {
                this.geschwindigkeit += geschwindigkeit;
            }
            else
            {
                setGeschwindigkeit((short)0);
            }
        }
    }

    //Konstruktor
    public Fahrzeug(short reifen, Color farbe, short ps, short tueren)
    {
        if(farbe == null)
        {
            farbe = Color.WHITE;
        }
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        gestartet = false;
        geschwindigkeit = 0;
        anzahl++;
    }
}
