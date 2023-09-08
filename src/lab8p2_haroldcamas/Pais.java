package lab8p2_haroldcamas;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Nadador> nadadores = new ArrayList();
    private int medallas;

    public Pais() {
    }

    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList nadadores) {
        this.nadadores = nadadores;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return nombre + "[" + medallas + "]";
    }
}
