package Aufgabe_4;

import javax.swing.*;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Eingabe der Zahelen
        String input1 = JOptionPane.showInputDialog("Bitte Eingabe tätigen!");
        String input2 = JOptionPane.showInputDialog("Bitte Eingabe tätigen!");
        String input3 = JOptionPane.showInputDialog("Bitte Eingabe tätigen!");

        //Vergleich der Zahlen
        // gleich -> 0, ungleich negative Zahlen
         int var1 = input1.compareTo(input2);
         int var2 = input1.compareTo(input3);
         int var3 = input2.compareTo(input3);

        //Ausgabe ob gleiche Zahlen dabei
        if (var1 == 0 && var2 == 0 && var3 == 0)
        {
            System.out.println("Alle Zahlen sind gleich!");
        }
        else if(var1 == 0 || var2 == 0|| var3 == 0)
        {
            System.out.println("Mind. zwei Zaheln sind gleich!");
        }
        else
            System.out.println("Keine der Zahlen sind gleich!");
    }
}
