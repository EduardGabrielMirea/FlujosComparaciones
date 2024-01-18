package Comparacion;

public class Localidad implements Comparable<Localidad>{

    private int invertido;
    private  int premios;


    public Localidad(int invertido, int premios) {
        this.invertido = invertido;
        this.premios = premios;
    }

    public int getInvertido(){
        return this.invertido;
    }

    public int getPremios(){
        return this.premios;
    }

    @Override
    public String toString(){
        return invertido + " - " + premios;
    }

    @Override
    public int compareTo(Localidad other) {
      if (this.invertido == other.getInvertido()){
          return this.premios - other.getPremios();
      }else {
          return other.invertido - this.getInvertido();
      }
    }

}
