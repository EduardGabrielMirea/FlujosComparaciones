package Comparacion;

public class Human implements Comparable<Human> {

    private String name;
    private  float salario;


    public Human(String name, float salario) {
        this.name = name;
        this.salario = salario;
    }

    public String getName(){
        return this.name;
    }

    public float getSalario(){
        return this.salario;
    }

    public String toString(){
        return name + " - " + salario;
    }
    public int compareTo(Human other){
        if (this.salario == other.getSalario()){
            return 0;
        } else if (this.salario > other.getSalario()) {
            return 1;
        }else {
            return -1;
        }
    }
}
