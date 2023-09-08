/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_haroldcamas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author harol
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_añadirPais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombrePais = new javax.swing.JTextField();
        sp_medallasPais = new javax.swing.JSpinner();
        bt_añadirPais = new javax.swing.JButton();
        jp_añadirEvento = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_estiloEvento = new javax.swing.JComboBox<>();
        cb_distanciaEvento = new javax.swing.JComboBox<>();
        sp_recordEvento = new javax.swing.JSpinner();
        bt_añadirEvento = new javax.swing.JButton();
        jp_añadirNadador = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_nombreNadador = new javax.swing.JTextField();
        cb_nacionalidad = new javax.swing.JComboBox<>();
        sp_edad = new javax.swing.JSpinner();
        sp_estatura = new javax.swing.JSpinner();
        cb_estiloNadador = new javax.swing.JComboBox<>();
        cb_distanciaNadador = new javax.swing.JComboBox<>();
        sp_recordNadador = new javax.swing.JSpinner();
        sp_medallasNadador = new javax.swing.JSpinner();
        bt_añadirNadador = new javax.swing.JButton();
        jp_listar = new javax.swing.JPanel();
        jp_simulacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Medallas");

        sp_medallasPais.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        bt_añadirPais.setText("Añadir Pais");
        bt_añadirPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirPaisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_añadirPaisLayout = new javax.swing.GroupLayout(jp_añadirPais);
        jp_añadirPais.setLayout(jp_añadirPaisLayout);
        jp_añadirPaisLayout.setHorizontalGroup(
            jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirPaisLayout.createSequentialGroup()
                .addGroup(jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_añadirPaisLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(100, 100, 100)
                        .addGroup(jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombrePais, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(sp_medallasPais)))
                    .addGroup(jp_añadirPaisLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(bt_añadirPais, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jp_añadirPaisLayout.setVerticalGroup(
            jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirPaisLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jp_añadirPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(sp_medallasPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(bt_añadirPais, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Pais", jp_añadirPais);

        jLabel3.setText("Estilo");

        jLabel4.setText("Distancia");

        jLabel5.setText("Tiempo Record (s)");

        cb_estiloEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        cb_distanciaEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        sp_recordEvento.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 0.5d));

        bt_añadirEvento.setText("Añadir Evento");
        bt_añadirEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirEventoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_añadirEventoLayout = new javax.swing.GroupLayout(jp_añadirEvento);
        jp_añadirEvento.setLayout(jp_añadirEventoLayout);
        jp_añadirEventoLayout.setHorizontalGroup(
            jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirEventoLayout.createSequentialGroup()
                .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_añadirEventoLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(103, 103, 103)
                        .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_distanciaEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_estiloEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp_recordEvento)))
                    .addGroup(jp_añadirEventoLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(bt_añadirEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jp_añadirEventoLayout.setVerticalGroup(
            jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirEventoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cb_estiloEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cb_distanciaEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp_añadirEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(sp_recordEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(bt_añadirEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Evento", jp_añadirEvento);

        jLabel6.setText("Nombre");

        jLabel7.setText("Nacionalidad");

        jLabel8.setText("Edad");

        jLabel9.setText("Estatura");

        jLabel10.setText("Estilo");

        jLabel11.setText("Distancia");

        jLabel12.setText("Record");

        jLabel13.setText("Medallas");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));

        sp_estatura.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 3.0d, 0.1d));

        cb_estiloNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Pecho", "Dorso", "Mariposa" }));

        cb_distanciaNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100m", "200m", "400m", "800m" }));

        sp_recordNadador.setModel(new javax.swing.SpinnerNumberModel(1.0d, 0.1d, null, 0.5d));

        sp_medallasNadador.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        bt_añadirNadador.setText("Añadir Nadador");
        bt_añadirNadador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_añadirNadadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jp_añadirNadadorLayout = new javax.swing.GroupLayout(jp_añadirNadador);
        jp_añadirNadador.setLayout(jp_añadirNadadorLayout);
        jp_añadirNadadorLayout.setHorizontalGroup(
            jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirNadadorLayout.createSequentialGroup()
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_añadirNadadorLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(138, 138, 138)
                        .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombreNadador)
                            .addComponent(cb_nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp_edad)
                            .addComponent(sp_estatura)
                            .addComponent(cb_estiloNadador, 0, 99, Short.MAX_VALUE)
                            .addComponent(cb_distanciaNadador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sp_recordNadador)
                            .addComponent(sp_medallasNadador)))
                    .addGroup(jp_añadirNadadorLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(bt_añadirNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jp_añadirNadadorLayout.setVerticalGroup(
            jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_añadirNadadorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sp_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_estiloNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_distanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sp_recordNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_añadirNadadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sp_medallasNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_añadirNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Nadador", jp_añadirNadador);

        javax.swing.GroupLayout jp_listarLayout = new javax.swing.GroupLayout(jp_listar);
        jp_listar.setLayout(jp_listarLayout);
        jp_listarLayout.setHorizontalGroup(
            jp_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jp_listarLayout.setVerticalGroup(
            jp_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar", jp_listar);

        javax.swing.GroupLayout jp_simulacionLayout = new javax.swing.GroupLayout(jp_simulacion);
        jp_simulacion.setLayout(jp_simulacionLayout);
        jp_simulacionLayout.setHorizontalGroup(
            jp_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
        );
        jp_simulacionLayout.setVerticalGroup(
            jp_simulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulacion", jp_simulacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_añadirPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirPaisMouseClicked
        if(tf_nombrePais.getText().equals("") || (int) sp_medallasPais.getModel().getValue() < 0){
            JOptionPane.showMessageDialog(this, "Tiene que llenar todas las casillas!");
        }
        else{
            Pais p = new Pais(tf_nombrePais.getText(), 
                    (int) sp_medallasPais.getModel().getValue());
            paises.add(p);
            
            File file = new File("./PaisesParticipantes.UWU");
            FileOutputStream fo = null;
            ObjectOutputStream os = null;
            
            try {
                fo = new FileOutputStream(file,true);
                os = new ObjectOutputStream(fo);
                
                os.writeObject(p);
                os.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fo.close();
                os.close();
            } catch (Exception e) {
            }
            
            tf_nombrePais.setText("");
            sp_medallasPais.getModel().setValue(0);
            JOptionPane.showMessageDialog(this, "Pais añadido exitosamente!");
        }
    }//GEN-LAST:event_bt_añadirPaisMouseClicked

    private void bt_añadirEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirEventoMouseClicked
        if(cb_distanciaEvento.getSelectedIndex() < 0 || cb_estiloEvento.getSelectedIndex() < 0 || (double) sp_recordEvento.getModel().getValue() == 0){
            JOptionPane.showMessageDialog(this, "Tiene que llenar las casillas!");
        }
        else{
            Evento e = new Evento((String) cb_estiloEvento.getSelectedItem(), 
                    (String) cb_estiloEvento.getSelectedItem(), 
                    (double) sp_recordEvento.getModel().getValue());
            eventos.add(e);
            
            File file = new File("./Eventos.UWU");
            FileOutputStream fo = null;
            ObjectOutputStream os = null;
            try {
                fo = new FileOutputStream(file,true);
                os = new ObjectOutputStream(fo);
                
                os.writeObject(e);
                os.flush();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                fo.close();
                os.close();
            } catch (Exception e2) {
            }
            
            cb_distanciaEvento.setSelectedIndex(-1);
            cb_estiloEvento.setSelectedIndex(-1);
            sp_recordEvento.getModel().setValue(0);
            JOptionPane.showMessageDialog(this, "Evento añadido exitosamente!");
        }
    }//GEN-LAST:event_bt_añadirEventoMouseClicked

    private void bt_añadirNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_añadirNadadorMouseClicked
        if(tf_nombreNadador.getText().equals("") || cb_nacionalidad.getSelectedIndex() == -1 || cb_estiloNadador.getSelectedIndex() == -1 || cb_distanciaNadador.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Tiene que llenar todas las casillas!");
        }
        
        else{
            int cuenta = contarEstilos((Pais) cb_nacionalidad.getSelectedItem(), (String) cb_estiloNadador.getSelectedItem());
            if(cuenta >= 2){
                JOptionPane.showMessageDialog(this, "No puede agregar mas nadadores de este estilo al pais!");
            }
            
            else{
                Nadador n = new Nadador(tf_nombreNadador.getText(), 
                    (Pais) cb_nacionalidad.getSelectedItem(), 
                    (int) sp_edad.getModel().getValue(), 
                    (double) sp_estatura.getModel().getValue(), 
                    (String) cb_estiloNadador.getSelectedItem(), 
                    (String) cb_distanciaNadador.getSelectedItem(), 
                    (double) sp_recordNadador.getModel().getValue(), 
                    (int) sp_medallasNadador.getModel().getValue());
                nadadores.add(n);

                File file = new File("./Nadadores.UWU");
                FileOutputStream fo = null;
                ObjectOutputStream os = null;
                try {
                    fo = new FileOutputStream(file,true);
                    os = new ObjectOutputStream(fo);

                    os.writeObject(n);
                    os.flush();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                try {
                    fo.close();
                    os.close();
                } catch (Exception e2) {
                }

                tf_nombreNadador.setText("");
                cb_nacionalidad.setSelectedIndex(-1);
                sp_edad.getModel().setValue(18);
                sp_estatura.getModel().setValue(1);
                cb_distanciaNadador.setSelectedIndex(-1);
                cb_estiloNadador.setSelectedIndex(-1);
                sp_recordNadador.getModel().setValue(1);
                sp_medallasNadador.getModel().setValue(0);
                JOptionPane.showMessageDialog(this, "Nadador añadido exitosamente!");
            }
        }
    }//GEN-LAST:event_bt_añadirNadadorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public static int contarEstilos(Pais p,String estilo){
        int cc = 0;
        for (Nadador nadador : p.getNadadores()) {
            if(nadador.getEstilo().equals(estilo)){
                cc ++;
            }
        }
        return cc;
    }
    ArrayList<Pais> paises = new ArrayList();
    ArrayList<Nadador> nadadores = new ArrayList();
    ArrayList<Evento> eventos = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_añadirEvento;
    private javax.swing.JButton bt_añadirNadador;
    private javax.swing.JButton bt_añadirPais;
    private javax.swing.JComboBox<String> cb_distanciaEvento;
    private javax.swing.JComboBox<String> cb_distanciaNadador;
    private javax.swing.JComboBox<String> cb_estiloEvento;
    private javax.swing.JComboBox<String> cb_estiloNadador;
    private javax.swing.JComboBox<String> cb_nacionalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jp_añadirEvento;
    private javax.swing.JPanel jp_añadirNadador;
    private javax.swing.JPanel jp_añadirPais;
    private javax.swing.JPanel jp_listar;
    private javax.swing.JPanel jp_simulacion;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_estatura;
    private javax.swing.JSpinner sp_medallasNadador;
    private javax.swing.JSpinner sp_medallasPais;
    private javax.swing.JSpinner sp_recordEvento;
    private javax.swing.JSpinner sp_recordNadador;
    private javax.swing.JTextField tf_nombreNadador;
    private javax.swing.JTextField tf_nombrePais;
    // End of variables declaration//GEN-END:variables
}
