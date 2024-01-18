package Comparacion;

public class Tarea implements Comparable<Tarea> {

    private String Country;
    private  int Value;


    public Tarea(String Country, int Value) {
        this.Country = Country;
        this.Value = Value;
    }

    public String getCountry(){
        return this.Country;
    }

    public float getValue(){
        return this.Value;
    }

    @Override
    public String toString(){
        return Country + " - " + Value;
    }

    @Override
    public int compareTo(Tarea tarea) {
        return 0;
    }
}
