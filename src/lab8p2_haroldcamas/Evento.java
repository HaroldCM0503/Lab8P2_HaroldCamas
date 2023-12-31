package lab8p2_haroldcamas;

import java.io.Serializable;

public class Evento implements Serializable{
    private String estilo;
    private String distancia;
    private double record;

    public Evento(){
    }

    public Evento(String estilo, String distancia, double record) {
        this.estilo = estilo;
        this.distancia = distancia;
        this.record = record;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return estilo + "[" + distancia + "]";
    }
}