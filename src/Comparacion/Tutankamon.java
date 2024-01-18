package Comparacion;

import java.util.ArrayList;

public class Tutankamon {
    public static void main(String[] args) {
        ArrayList<Inventario> objetos = new ArrayList<>();
        objetos.add(new Inventario(5,1,"flecha"));
        objetos.add(new Inventario(10,2,"Sandalias"));
        objetos.add(new Inventario(1000,1000,"Sarcofago"));
        objetos.add(new Inventario(1000,10,"Mascara"));
        objetos.add(new Inventario(10,2,"Arco"));

        objetos.stream().sorted().forEach(System.out::print);


    }

}

