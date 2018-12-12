package Aufgabe_2;

public class Aufruf
{
    public static void main(String[] args)
    {
        Mensch mensch1 = new Mensch("hans", "peter", 53);
        System.out.println(mensch1.status());

        Student student1 = new Student("julian", "eisenmann", 23, 1239123, "Web Business");
        System.out.println(student1.status());
    }
}
