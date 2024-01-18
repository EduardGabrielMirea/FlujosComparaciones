package Comparacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Analfabetos {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/INFORMATICA/alu10187979/IdeaProjects/Flujos/Archivos/illiterate.csv"));

            String line, country;
            int value;


            ArrayList<Pais> paises = new ArrayList<>();
            String[] tabla;

            line = reader.readLine();
            while ((line = reader.readLine())!=null) { //leyendo palabras
                tabla = line.split(",");
                    country = tabla[5];
                    value = Integer.parseInt(tabla[8]);

                    Pais personas = new Pais(country,value);
                    paises.add(personas);
            }
            paises.stream()
                    .sorted()
                    .forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("El fichero no existe");
        }
    }
}
