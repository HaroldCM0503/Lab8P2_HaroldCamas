package lab8p2_haroldcamas;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JProgressBar;

public class Simulacion extends Thread{
    private ArrayList<Nadador> nadadores;
    private ArrayList<JProgressBar> barras;
    private boolean vive;

    public Simulacion() {
    }

    public Simulacion(ArrayList<Nadador> nadadores, ArrayList<JProgressBar> barras) {
        this.nadadores = nadadores;
        this.barras = barras;
        this.vive = true;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public ArrayList<JProgressBar> getBarras() {
        return barras;
    }

    public void setBarras(ArrayList<JProgressBar> barras) {
        this.barras = barras;
    }
    
    @Override
    public void run(){
        while(vive){
            while(true){
                Random rand = new Random();
                for (int i = 0; i < nadadores.size(); i++) {
                    int paso = rand.nextInt(10) + 1;
                    barras.get(i).setValue(barras.get(i).getValue() + paso);
                    if(barras.get(0).getValue() >= 100 || barras.get(1).getValue() >= 100|| barras.get(2).getValue() >= 100){
                        vive = false;
                        break;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }
}
