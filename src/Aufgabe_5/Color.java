package Aufgabe_5;

public enum Color
    {
        SILVER ("Silver"),
        RED ("Red"),
        BLACK ("black"),
        BLUE ("blue"),
        WHITE ("white");

        Color(String color)
        {
            this.color = color;
        }
        private final String color;

        public String getColor()
        {
            return color;
        }
    }

