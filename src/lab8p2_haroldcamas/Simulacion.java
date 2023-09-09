package lab8p2_haroldcamas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Simulacion extends Thread {

    private ArrayList<Nadador> nadadores;
    private ArrayList<JProgressBar> barras;
    private boolean vive = true;

    public Simulacion() {
    }

    public Simulacion(ArrayList<Nadador> nadadores, ArrayList<JProgressBar> barras) {
        this.nadadores = nadadores;
        this.barras = barras;
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
    public void run() {
        while (vive) {
            Random rand = new Random();
            for (int i = 0; i < nadadores.size(); i++) {
                int paso = rand.nextInt(10) + 1;
                barras.get(i).setValue(barras.get(i).getValue() + paso);

                if (barras.get(i).getValue() == 100) {
                    vive = false;

                    Nadador n = null;
                    n = nadadores.get(i);
                    JOptionPane.showMessageDialog(barras.get(i).getParent(), "El ganador de los " + n.getDistancia() + " de " + n.getEstilo() + " es " + n);

                    File file = new File("./Ganadores.UWU");
                    try {
                        FileOutputStream fo = new FileOutputStream(file);
                        ObjectOutputStream os = new ObjectOutputStream(fo);
                        for (Nadador nadadore : nadadores) {
                            os.writeObject(nadadore);
                        }

                        os.flush();
                        try {
                            fo.close();
                            os.close();
                        } catch (Exception e2) {
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
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
