package Aufgabe_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        List<Auto> liste = new ArrayList<>();
        liste.add(new Auto ((short)4,"blau",(short)250, (short) 4, (short) 4));
        liste.add(new Auto((short)4,"rot",(short)120, (short) 4, (short) 5));
        liste.add(new Auto((short)4,"gelb",(short)430, (short) 4, (short) 4));
        liste.add(new Auto((short)4,"schwarz",(short)240, (short) 4, (short) 3));
        liste.add(new Auto((short)4,"pink",(short)430, (short) 4, (short) 4));


        Collections.sort(liste);

        for(Auto a:liste)
        {
            System.out.println(a.toString());
        }

    }
}
