import java.util.ArrayList;

public class Personas {
    public static void main(String[] args) {

        ArrayList<Person> personas = new ArrayList<>();

        //Añado 1 persona al arraylist de personas.
        //Defino la variable persona como Person.
        Person persona =new Person("Pepe","García",1968);
        personas.add(persona);

        persona = new Person("María","García",1998);
        personas.add(persona);

        persona = new Person("Juan","Martínez",1968);
        personas.add(persona);

        long cuantasPersonas = personas.stream()
                .filter(p -> p.getBirthYear() < 1970)
                .count();

        System.out.println("Hay " + cuantasPersonas + " persona/as nacida/as ántes del 1970.");

    }
}
