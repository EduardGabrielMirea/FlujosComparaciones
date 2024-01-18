package Comparacion;

public class Inventario implements Comparable<Inventario> {

    private String nombre;
    private  int valor;
    private  int peso;


    public Inventario(int valor, int peso, String nombre) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getValor(){
        return this.valor;
    }
    public int getPeso(){return this.peso;}

    @Override
    public String toString(){
        return nombre + " ";
    }

    @Override
    public int compareTo(Inventario other) {
        if (this.valor == other.getValor() ){
            if (this.peso == other.getPeso()){
                return this.valor - other.getValor();
            }
            return this.peso - other.getPeso();
        }
        return other.getValor() - this.valor;
    }

}
