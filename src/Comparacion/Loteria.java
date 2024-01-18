package Comparacion;

import java.util.ArrayList;

public class Loteria {

    public static void main(String[] args) {
        ArrayList<Localidad> ciudad = new ArrayList<>();
        ciudad.add(new Localidad(9, 4));
        ciudad.add(new Localidad(10, 6));
        ciudad.add(new Localidad(9, 5));
        ciudad.add(new Localidad(1, 3));

        ciudad.stream().sorted().forEach(System.out::println);

        if (esJusto(ciudad)){
            System.out.println("si");
        }else {
            System.out.println("no");
        }


        ArrayList<Localidad> ciudad2= new ArrayList<>();
        ciudad2.add(new Localidad(10, 5));
        ciudad2.add(new Localidad(20, 5));
        ciudad2.add(new Localidad(30, 5));

        ciudad2.stream().sorted().forEach(System.out::println);

        if (esJusto(ciudad2)){
            System.out.println("si");
        }else {
            System.out.println("no");
        }

    }

    public static boolean esJusto(ArrayList<Localidad> ciudad ){
        for (int i = 0; i < ciudad.size() - 1; i++) {
            Localidad actual = ciudad.get(i);
            Localidad siguiente = ciudad.get(i + 1);
            if (actual.getInvertido() <= siguiente.getInvertido() && actual.getPremios() < siguiente.getPremios()){
                return true;
            }
        }
        return false;
    }


}
