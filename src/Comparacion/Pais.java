package Comparacion;

public class Pais implements Comparable<Pais>{
    private String Country;
    private  int Value;


    public Pais(String Country, int Value) {
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
    public int compareTo(Pais other){
        if (this.Value == other.getValue()){
            return 0;
        } else if (this.Value > other.getValue()) {
            return 1;
        }else {
            return -1;
        }
    }
}
