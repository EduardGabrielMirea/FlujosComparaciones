import java.util.ArrayList;
import java.util.List;

public class SumaPositivosNegativos {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(-10);
        numeros.add(-20);
        numeros.add(-30);

        long positivos = numeros.stream()
                .filter(n -> n > 0)
                .count();
        long negativos = numeros.stream()
                .filter(numero -> numero < 0)
                .count();

        System.out.println("Hay " + positivos + " numeros positivos y " + negativos + " numeros negativos.");

        //Con esto sumas numeros.
        int suma = numeros.stream()
                .mapToInt(b -> b.intValue())
                //.mapToInt(Integer::valueOf)
                .sum();

        System.out.println(suma);
    }

}
