package Main;

import Especie.Molusco;
import Especie.Tiburon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PanelMolusco extends JFrame implements ActionListener {
    //Parametros para conexión y uso de BBDD
    Connection connection = null;
    PreparedStatement pstatment = null;
    //Parametros DB
    String user = "kev";
    String password = "Gatito.10";
    String sql;

    //Creamos un panel nuevo para molusco
    private JPanel contenedorMolusco;

    //Creamos etiquetas para molusco
    private JLabel jlbTipo;
    private JLabel jlbNombre;
    private JLabel jlbHabitat;
    private JLabel jlbSexo;
    private JLabel jlbProfundidad;
    private JLabel jlbTiempoNavegacion;
    private JLabel jlbNubosidad;
    private JLabel jlbFuerzaViento;
    private JLabel jlbDireccionViento;
    private JLabel jlbHoraLlegada;
    private JLabel jlbEmbarcacionesZona;
    private JLabel jlbTempSup;
    private JLabel jlbMedidas;

    //Creamos campos de texto para molusco
    private JTextField jtfTipo;
    private JTextField jtfNombre;
    private JTextField jtfHabitat;
    private JTextField jtfSexo;
    private JTextField jtfProfundidad;
    private JTextField jtfTiempoNavegacion;
    private JTextField jtfNubosidad;
    private JTextField jtfFuerzaViento;
    private JTextField jtfDireccionViento;
    private JTextField jtfHoraLlegada;
    private JTextField jtfEmbarcacionesZona;
    private JTextField jtfTempSup;
    private JTextField jtfMedidas;

    //Creamos botones para molusco
    private JButton jbtCalculate1;
    private JButton jbtCalculate2;
    private JButton jbtCalculate3;
    private JButton jbtCalculate4;
    private JButton jbtOk;
    private JButton jbtBefore;

    //Generamos el panel para molusco
    public PanelMolusco() {
        this.setSize(800, 700);
        this.setTitle("Especies Marinas");
        initComponents();
        this.add(contenedorMolusco);
    }

    //iniciamos todos los valores que creamos anteriormente
    private void initComponents() {
        //especies
        contenedorMolusco = new JPanel();

        //etiquetas
        jlbTipo = new JLabel();
        jlbNombre = new JLabel();
        jlbHabitat = new JLabel();
        jlbSexo = new JLabel();
        jlbProfundidad = new JLabel();
        jlbTiempoNavegacion = new JLabel();
        jlbNubosidad = new JLabel();
        jlbFuerzaViento = new JLabel();
        jlbDireccionViento = new JLabel();
        jlbHoraLlegada = new JLabel();
        jlbEmbarcacionesZona = new JLabel();
        jlbTempSup = new JLabel();
        jlbMedidas = new JLabel();

        //campos a rellenar
        jtfTipo = new JTextField();
        jtfNombre = new JTextField();
        jtfHabitat = new JTextField();
        jtfSexo = new JTextField();
        jtfProfundidad = new JTextField();
        jtfTiempoNavegacion = new JTextField();
        jtfNubosidad = new JTextField();
        jtfFuerzaViento = new JTextField();
        jtfDireccionViento = new JTextField();
        jtfHoraLlegada = new JTextField();
        jtfEmbarcacionesZona = new JTextField();
        jtfTempSup = new JTextField();
        jtfMedidas = new JTextField();

        //botones
        jbtBefore = new JButton();
        jbtOk = new JButton();
        jbtCalculate1 = new JButton();
        jbtCalculate2 = new JButton();
        jbtCalculate3 = new JButton();
        jbtCalculate4 = new JButton();

        //Interfaz Molusco
        this.jlbTipo.setText("Tipo");
        this.getContentPane().add(this.jlbTipo);
        this.jlbTipo.setBounds(20, 28, 150, 14);
        this.jtfTipo.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTipo);
        this.jtfTipo.setBounds(220, 28, 550, 20);

        this.jlbNombre.setText("Nombre");
        this.getContentPane().add(this.jlbNombre);
        this.jlbNombre.setBounds(20, 58, 150, 14);
        this.jtfNombre.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfNombre);
        this.jtfNombre.setBounds(220, 58, 550, 20);

        this.jlbHabitat.setText("Habitat");
        this.getContentPane().add(this.jlbHabitat);
        this.jlbHabitat.setBounds(20, 88, 150, 14);
        this.jtfHabitat.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfHabitat);
        this.jtfHabitat.setBounds(220, 88, 550, 20);

        this.jlbSexo.setText("Sexo");
        this.getContentPane().add(this.jlbSexo);
        this.jlbSexo.setBounds(20, 118, 150, 14);
        this.jtfSexo.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfSexo);
        this.jtfSexo.setBounds(220, 118, 550, 20);

        this.jlbProfundidad.setText("Profundidad");
        this.getContentPane().add(this.jlbProfundidad);
        this.jlbProfundidad.setBounds(20, 148, 150, 14);
        this.jtfProfundidad.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfProfundidad);
        this.jtfProfundidad.setBounds(220, 148, 550, 20);


        this.jlbTiempoNavegacion.setText("Tiempo de navegación (min)");
        this.getContentPane().add(this.jlbTiempoNavegacion);
        this.jlbTiempoNavegacion.setBounds(20, 178, 200, 14);
        this.jtfTiempoNavegacion.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTiempoNavegacion);
        this.jtfTiempoNavegacion.setBounds(220, 178, 550, 20);

        this.jlbNubosidad.setText("Nubosidad");
        this.getContentPane().add(this.jlbNubosidad);
        this.jlbNubosidad.setBounds(20, 208, 150, 14);
        this.jtfNubosidad.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfNubosidad);
        this.jtfNubosidad.setBounds(220, 208, 550, 20);

        this.jlbFuerzaViento.setText("Fuerza del viento");
        this.getContentPane().add(this.jlbFuerzaViento);
        this.jlbFuerzaViento.setBounds(20, 238, 150, 14);
        this.jtfFuerzaViento.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfFuerzaViento);
        this.jtfFuerzaViento.setBounds(220, 238, 550, 20);

        this.jlbDireccionViento.setText("Dirección del viento");
        this.getContentPane().add(this.jlbDireccionViento);
        this.jlbDireccionViento.setBounds(20, 268, 150, 14);
        this.jtfDireccionViento.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfDireccionViento);
        this.jtfDireccionViento.setBounds(220, 268, 550, 20);

        this.jlbHoraLlegada.setText("Hora de llegada");
        this.getContentPane().add(this.jlbHoraLlegada);
        this.jlbHoraLlegada.setBounds(20, 298, 150, 14);
        this.jtfHoraLlegada.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfHoraLlegada);
        this.jtfHoraLlegada.setBounds(220, 298, 550, 20);

        this.jlbEmbarcacionesZona.setText("Embarcaciones en zona");
        this.getContentPane().add(this.jlbEmbarcacionesZona);
        this.jlbEmbarcacionesZona.setBounds(20, 328, 150, 14);
        this.jtfEmbarcacionesZona.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfEmbarcacionesZona);
        this.jtfEmbarcacionesZona.setBounds(220, 328, 550, 20);

        this.jlbTempSup.setText("Temperatura superficial");
        this.getContentPane().add(this.jlbTempSup);
        this.jlbTempSup.setBounds(20, 358, 150, 14);
        this.jtfTempSup.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTempSup);
        this.jtfTempSup.setBounds(220, 358, 550, 20);


        this.jlbMedidas.setText("Medidas");
        this.getContentPane().add(this.jlbMedidas);
        this.jlbMedidas.setBounds(20, 388, 150, 14);
        this.jtfMedidas.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfMedidas);
        this.jtfMedidas.setBounds(220, 388, 550, 20);
        //Ok
        this.jbtOk.setText("Añadir registro");
        this.getContentPane().add(this.jbtOk);
        this.jbtOk.setBounds(650, 600, 100, 20);
        this.jbtOk.addActionListener((e) -> {
            try {
                this.jbtOkActionPerformed(e);
            } catch (SQLException var3) {
                var3.printStackTrace();
            }

        });

        //Boton atras
        this.jbtBefore.setText("Volver");
        this.getContentPane().add(this.jbtBefore);
        this.jbtBefore.setBounds(50, 600, 100, 20);
        this.jbtBefore.addActionListener((e) -> {
            try {
                this.jbtBeforeActionPerformed(e);
            } catch (SQLException var3) {
                var3.printStackTrace();
            }

        });
    }

    //Acción para volver hacia atras
    private void jbtBeforeActionPerformed(ActionEvent ae) throws SQLException{
        Object evt = ae.getSource();
        if(evt.equals(jbtBefore)){
            MyFrame retFrame = new MyFrame();
            retFrame.setVisible(true);
            this.dispose();
        }
    }

    //Boton para añadir registros
    private void jbtOkActionPerformed(ActionEvent evt) throws SQLException {
        //Validador
        boolean animalEnter = true;
        //Construimos un nuevo objeto molusco
        Molusco mmolusco = new Molusco();

        //Obtenemos los valores de los campos que rellenamos para añadirlo a nuestro constructor
        String molusco = "molusco";
        mmolusco.setEspecie(molusco);
        mmolusco.setTipo(jtfTipo.getText().trim());
        mmolusco.setNombre(jtfNombre.getText().trim());
        mmolusco.setHabitat(jtfHabitat.getText().trim());
        mmolusco.setSexo(jtfSexo.getText().trim());
        int profundidadInt = Integer.parseInt(jtfProfundidad.getText());
        mmolusco.setProfundidad(profundidadInt);
        int tiempoNavInt = Integer.parseInt(jtfTiempoNavegacion.getText());
        mmolusco.setTiempo_navegacion(tiempoNavInt);
        mmolusco.setNubosidad(jtfNubosidad.getText().trim());
        mmolusco.setFuerza_viento(jtfFuerzaViento.getText().trim());
        mmolusco.setDireccion_viento(jtfDireccionViento.getText().trim());
        mmolusco.setHora_llegada(jtfHoraLlegada.getText().trim());
        int embZonaInt = Integer.parseInt(jtfEmbarcacionesZona.getText());
        mmolusco.setEmbarcaciones_zona(embZonaInt);
        int tempSupInt = Integer.parseInt(jtfTempSup.getText());
        mmolusco.setTemperatura_sup(tempSupInt);
        mmolusco.setMedidas(jtfMedidas.getText().trim());

        //Conexión A BBDD y insert de datos
        try {
            connection = DriverManager.getConnection("jdbc:mysql://mysql-kev.alwaysdata.net/kev_especiesmarinas", user, password);
            sql = "INSERT INTO molusco (especie, tipo, nombre, habitat, sexo, profundidad, tiempo_navegacion, nubosidad, fuerza_viento, direccion_viento, hora_llegada, embarcaciones_zona, temperatura_superf, medidas) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            try {
                this.pstatment = connection.prepareStatement(sql);
                this.pstatment.setString(1, mmolusco.getEspecie());
                this.pstatment.setString(2, mmolusco.getTipo());
                this.pstatment.setString(3, mmolusco.getNombre());
                this.pstatment.setString(4, mmolusco.getHabitat());
                this.pstatment.setString(5, mmolusco.getSexo());
                this.pstatment.setInt(6, mmolusco.getProfundidad());
                this.pstatment.setInt(7, mmolusco.getTiempo_navegacion());
                this.pstatment.setString(8, mmolusco.getNubosidad());
                this.pstatment.setString(9, mmolusco.getFuerza_viento());
                this.pstatment.setString(10, mmolusco.getDireccion_viento());
                this.pstatment.setString(11, mmolusco.getHora_llegada());
                this.pstatment.setInt(12, mmolusco.getEmbarcaciones_zona());
                this.pstatment.setInt(13, mmolusco.getTemperatura_sup());
                this.pstatment.setString(14, mmolusco.getMedidas());
                this.pstatment.executeUpdate();
            } catch (SQLException var15) {
                JOptionPane.showMessageDialog(this.rootPane, "Error en el codigo");
                System.out.println("Error1");
                animalEnter = false;
            }
        } catch (SQLException var16) {
            var16.printStackTrace();
            System.out.println("Error2");
            animalEnter = false;
        } finally {
            this.pstatment.close();
            this.connection.close();
        }

        if (animalEnter) {
            JOptionPane.showMessageDialog(this.rootPane, "Registro añadido correctamente");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
