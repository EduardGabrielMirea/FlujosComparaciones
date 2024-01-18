package Comparacion;

import java.util.ArrayList;

public class Personas {

    public static void main(String[] args) {

        ArrayList<Human> personas = new ArrayList<>();

        Human persona = new Human("Juan",1050);
        personas.add(persona);

        persona = new Human("Adrian",1200);
        personas.add(persona);

        persona = new Human("Eduard", 1100);
        personas.add(persona);

        personas.stream()
                .sorted()
                .forEach(System.out::println);

    }

}
