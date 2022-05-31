package Main;

/**
 *Api para añadir nuevos registros de especies marinas
 * en BBDD de Cloud Mysql
 * @autor Kevin Añazco Honores
 *
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import static java.awt.EventQueue.invokeLater;

public class MyFrame extends JFrame implements ActionListener{

    //Definición de parametros para Interfaz
    //Definimos un Panel
    private JPanel contenedor;

    //Definimos los botones para la elección de especie
    private JButton jbtTiburon;
    private JButton jbtRaya;
    private JButton jbtMolusco;
    private JButton jbtAlga;
    private JButton jbtExit;


    public MyFrame(){
        this.setSize(800, 700);
        this.setTitle("Especies Marinas");
        initComponents();

        jbtTiburon.addActionListener(this);
        jbtRaya.addActionListener(this);
        jbtMolusco.addActionListener(this);
        jbtAlga.addActionListener(this);
        this.add(contenedor);
    }

    private void initComponents() {

        contenedor = new JPanel();
        jbtTiburon = new JButton();
        jbtRaya = new JButton();
        jbtMolusco = new JButton();
        jbtAlga = new JButton();
        jbtExit = new JButton();

        //Creamos la interfaz para especies:
        this.jbtTiburon.setText("Tiburon");
        this.getContentPane().add(this.jbtTiburon);
        this.jbtTiburon.setBounds(50, 300, 100, 20);

        this.jbtRaya.setText("Raya");
        this.getContentPane().add(this.jbtRaya);
        this.jbtRaya.setBounds(250, 300, 100, 20);

        this.jbtMolusco.setText("Molusco");
        this.getContentPane().add(this.jbtMolusco);
        this.jbtMolusco.setBounds(450, 300, 100, 20);

        this.jbtAlga.setText("Alga");
        this.getContentPane().add(this.jbtAlga);
        this.jbtAlga.setBounds(650, 300, 100, 20);

        this.jbtExit.setText("Salir");
        this.getContentPane().add(this.jbtExit);
        this.jbtExit.setBounds(350, 650, 100, 20);
        this.jbtExit.addActionListener((e) -> {
            try {
                this.jbtExitActionPerformed(e);
            } catch (SQLException var3) {
                var3.printStackTrace();
            }
        });
    }

    //Inicializamos nuestra App
    public static void main(String[] args) {
        invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyFrame().setVisible(true);
            }
        });
    }

    //Aqui escogemos la interfaz que usaremos para añadir datos a la BBDD
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object evt = ae.getSource();
        if(evt.equals(jbtTiburon)){
            PanelTiburon panelTiburon = new PanelTiburon();
            panelTiburon.setVisible(true);
            this.dispose();
        }else if (evt.equals(jbtRaya)){
            PanelRaya panelRaya = new PanelRaya();
            panelRaya.setVisible(true);
            this.dispose();
        }else if (evt.equals(jbtMolusco)){
            PanelMolusco panelMolusco = new PanelMolusco();
            panelMolusco.setVisible(true);
            this.dispose();
        }else if(evt.equals((jbtAlga))){
            PanelAlga panelAlga = new PanelAlga();
            panelAlga.setVisible(true);
            this.dispose();
        }

    }

    private void jbtExitActionPerformed(ActionEvent ae) throws SQLException {
        System.exit(0);
    }


}


