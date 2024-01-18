import java.util.ArrayList;

public class NombresUnicosAlfabeticos {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        Person persona = new Person("Pepe","García", 1968);
        personas.add(persona);

        persona = new Person("María","García",1998);
        personas.add(persona);

        persona = new Person("Juan","Martínez",1968);
        personas.add(persona);

        persona = new Person("Xin","Ajun",1995);
        personas.add(persona);

        persona = new Person("Xin","Shun",1990);
        personas.add(persona);

            personas.stream()
                .map(Person::getFirstName)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }

}
