package Aufgabe_5;

public class Aufruf
{
    public static void main(String[] args)
    {
        Auto bmw = new Auto((short) 4, null, (short) 120, (short) 5, (short) 4);
        System.out.println(bmw);

        Auto audi = new Auto((short) 4, Color.BLACK, (short) 240, (short) 5, (short) 4);
        System.out.println(audi);
    }
}
