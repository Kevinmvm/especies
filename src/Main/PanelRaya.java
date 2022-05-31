package Main;

import Especie.Raya;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PanelRaya extends JFrame implements ActionListener {
    //Parametros para conexión y uso de BBDD
    Connection connection = null;
    PreparedStatement pstatment = null;
    //Parametros DB
    String user = "kev";
    String password = "Gatito.10";
    String sql;

    //Creamos un panel nuevo para raya
    private JPanel contenedorRaya;

    //Creamos etiquetas para raya
    private JLabel jlbTipo;
    private JLabel jlbNombre;
    private JLabel jlbHabitat;
    private JLabel jlbSexo;
    private JLabel jlbProfundidad;
    private JLabel jlbPelagico;
    private JLabel jlbTiempoNavegacion;
    private JLabel jlbNubosidad;
    private JLabel jlbFuerzaViento;
    private JLabel jlbDireccionViento;
    private JLabel jlbHoraLlegada;
    private JLabel jlbEmbarcacionesZona;
    private JLabel jlbTempSup;
    private JLabel jlbTipoCebo;
    private JLabel jlbParasitos;
    private JLabel jlbPresAnzuelos;
    private JLabel jlbNumAnzuelos;
    private JLabel jlbMedidas;

    //Creamos campos de texto para raya
    private JTextField jtfTipo;
    private JTextField jtfNombre;
    private JTextField jtfHabitat;
    private JTextField jtfSexo;
    private JTextField jtfProfundidad;
    private JTextField jtfPelagico;
    private JTextField jtfTiempoNavegacion;
    private JTextField jtfNubosidad;
    private JTextField jtfFuerzaViento;
    private JTextField jtfDireccionViento;
    private JTextField jtfHoraLlegada;
    private JTextField jtfEmbarcacionesZona;
    private JTextField jtfTempSup;
    private JTextField jtfTipoCebo;
    private JTextField jtfParasitos;
    private JTextField jtfPresAnzuelos;
    private JTextField jtfNumAnzuelos;
    private JTextField jtfMedidas;

    //Creamos botones para raya
    private JButton jbtCalculate1;
    private JButton jbtCalculate2;
    private JButton jbtCalculate3;
    private JButton jbtCalculate4;
    private JButton jbtOk;
    private JButton jbtBefore;

    //Generamos el panel para raya
    public PanelRaya() {
        this.setSize(800, 700);
        this.setTitle("Especies Marinas");
        initComponents();
        this.add(contenedorRaya);
    }
    //iniciamos todos los valores que creamos anteriormente
    private void initComponents() {
        //especie
        contenedorRaya = new JPanel();

        //etiquetas
        jlbTipo = new JLabel();
        jlbNombre = new JLabel();
        jlbHabitat = new JLabel();
        jlbSexo = new JLabel();
        jlbProfundidad = new JLabel();
        jlbPelagico = new JLabel();
        jlbTiempoNavegacion = new JLabel();
        jlbNubosidad = new JLabel();
        jlbFuerzaViento = new JLabel();
        jlbDireccionViento = new JLabel();
        jlbHoraLlegada = new JLabel();
        jlbEmbarcacionesZona = new JLabel();
        jlbTempSup = new JLabel();
        jlbTipoCebo = new JLabel();
        jlbParasitos = new JLabel();
        jlbPresAnzuelos = new JLabel();
        jlbNumAnzuelos = new JLabel();
        jlbMedidas = new JLabel();

        //campos a rellenar
        jtfTipo = new JTextField();
        jtfNombre = new JTextField();
        jtfHabitat = new JTextField();
        jtfSexo = new JTextField();
        jtfProfundidad = new JTextField();
        jtfPelagico = new JTextField();
        jtfTiempoNavegacion = new JTextField();
        jtfNubosidad = new JTextField();
        jtfFuerzaViento = new JTextField();
        jtfDireccionViento = new JTextField();
        jtfHoraLlegada = new JTextField();
        jtfEmbarcacionesZona = new JTextField();
        jtfTempSup = new JTextField();
        jtfTipoCebo = new JTextField();
        jtfParasitos = new JTextField();
        jtfPresAnzuelos = new JTextField();
        jtfNumAnzuelos = new JTextField();
        jtfMedidas = new JTextField();

        //botones
        jbtBefore = new JButton();
        jbtOk = new JButton();
        jbtCalculate1 = new JButton();
        jbtCalculate2 = new JButton();
        jbtCalculate3 = new JButton();
        jbtCalculate4 = new JButton();

        //Interfaz Raya
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

        this.jlbPelagico.setText("Pelagico");
        this.getContentPane().add(this.jlbPelagico);
        this.jlbPelagico.setBounds(20, 178, 150, 14);
        this.jtfPelagico.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfPelagico);
        this.jtfPelagico.setBounds(220, 178, 550, 20);

        this.jlbTiempoNavegacion.setText("Tiempo de navegación (min)");
        this.getContentPane().add(this.jlbTiempoNavegacion);
        this.jlbTiempoNavegacion.setBounds(20, 208, 200, 14);
        this.jtfTiempoNavegacion.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTiempoNavegacion);
        this.jtfTiempoNavegacion.setBounds(220, 208, 550, 20);

        this.jlbNubosidad.setText("Nubosidad");
        this.getContentPane().add(this.jlbNubosidad);
        this.jlbNubosidad.setBounds(20, 238, 150, 14);
        this.jtfNubosidad.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfNubosidad);
        this.jtfNubosidad.setBounds(220, 238, 550, 20);

        this.jlbFuerzaViento.setText("Fuerza del viento");
        this.getContentPane().add(this.jlbFuerzaViento);
        this.jlbFuerzaViento.setBounds(20, 268, 150, 14);
        this.jtfFuerzaViento.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfFuerzaViento);
        this.jtfFuerzaViento.setBounds(220, 268, 550, 20);

        this.jlbDireccionViento.setText("Dirección del viento");
        this.getContentPane().add(this.jlbDireccionViento);
        this.jlbDireccionViento.setBounds(20, 298, 150, 14);
        this.jtfDireccionViento.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfDireccionViento);
        this.jtfDireccionViento.setBounds(220, 298, 550, 20);

        this.jlbHoraLlegada.setText("Hora de llegada");
        this.getContentPane().add(this.jlbHoraLlegada);
        this.jlbHoraLlegada.setBounds(20, 328, 150, 14);
        this.jtfHoraLlegada.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfHoraLlegada);
        this.jtfHoraLlegada.setBounds(220, 328, 550, 20);

        this.jlbEmbarcacionesZona.setText("Embarcaciones en zona");
        this.getContentPane().add(this.jlbEmbarcacionesZona);
        this.jlbEmbarcacionesZona.setBounds(20, 358, 150, 14);
        this.jtfEmbarcacionesZona.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfEmbarcacionesZona);
        this.jtfEmbarcacionesZona.setBounds(220, 358, 550, 20);

        this.jlbTempSup.setText("Temperatura superficial");
        this.getContentPane().add(this.jlbTempSup);
        this.jlbTempSup.setBounds(20, 388, 150, 14);
        this.jtfTempSup.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTempSup);
        this.jtfTempSup.setBounds(220, 388, 550, 20);

        this.jlbTipoCebo.setText("Tipo de cebo");
        this.getContentPane().add(this.jlbTipoCebo);
        this.jlbTipoCebo.setBounds(20, 418, 150, 14);
        this.jtfTipoCebo.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfTipoCebo);
        this.jtfTipoCebo.setBounds(220, 418, 550, 20);

        this.jlbParasitos.setText("Parasitos");
        this.getContentPane().add(this.jlbParasitos);
        this.jlbParasitos.setBounds(20, 448, 150, 14);
        this.jtfParasitos.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfParasitos);
        this.jtfParasitos.setBounds(220, 448, 550, 20);

        this.jlbPresAnzuelos.setText("Presencia de anzuelos");
        this.getContentPane().add(this.jlbPresAnzuelos);
        this.jlbPresAnzuelos.setBounds(20, 478, 150, 14);
        this.jtfPresAnzuelos.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfPresAnzuelos);
        this.jtfPresAnzuelos.setBounds(220, 478, 550, 20);

        this.jlbNumAnzuelos.setText("Numero de anzuelos");
        this.getContentPane().add(this.jlbNumAnzuelos);
        this.jlbNumAnzuelos.setBounds(20, 508, 150, 14);
        this.jtfNumAnzuelos.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfNumAnzuelos);
        this.jtfNumAnzuelos.setBounds(220, 508, 550, 20);

        this.jlbMedidas.setText("Medidas");
        this.getContentPane().add(this.jlbMedidas);
        this.jlbMedidas.setBounds(20, 538, 150, 14);
        this.jtfMedidas.setHorizontalAlignment(4);
        this.getContentPane().add(this.jtfMedidas);
        this.jtfMedidas.setBounds(220, 538, 550, 20);

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
        Raya mraya = new Raya();

        //Obtenemos los valores de los campos que rellenamos para añadirlo a nuestro constructor
        String raya = "raya";
        mraya.setEspecie(raya);
        mraya.setTipo(jtfTipo.getText().trim());
        mraya.setNombre(jtfNombre.getText().trim());
        mraya.setHabitat(jtfHabitat.getText().trim());
        mraya.setSexo(jtfSexo.getText().trim());
        int profundidadInt = Integer.parseInt(jtfProfundidad.getText());
        mraya.setProfundidad(profundidadInt);
        mraya.setPelagico(jtfPelagico.getText().trim());
        int tiempoNavInt = Integer.parseInt(jtfTiempoNavegacion.getText());
        mraya.setTiempo_navegacion(tiempoNavInt);
        mraya.setNubosidad(jtfNubosidad.getText().trim());
        mraya.setFuerza_viento(jtfFuerzaViento.getText().trim());
        mraya.setDireccion_viento(jtfDireccionViento.getText().trim());
        mraya.setHora_llegada(jtfHoraLlegada.getText().trim());
        int embZonaInt = Integer.parseInt(jtfEmbarcacionesZona.getText());
        mraya.setEmbarcaciones_zona(embZonaInt);
        int tempSupInt = Integer.parseInt(jtfTempSup.getText());
        mraya.setTemperatura_sup(tempSupInt);
        mraya.setTipo_cebo(jtfTipoCebo.getText().trim());
        mraya.setParasitos(jtfParasitos.getText().trim());
        mraya.setPrecencia_anzuelos(jtfPresAnzuelos.getText().trim());
        int numAnzuelosInt = Integer.parseInt(jtfNumAnzuelos.getText());
        mraya.setNumero_anzuelos(numAnzuelosInt);
        mraya.setMedidas(jtfMedidas.getText().trim());

        //Conexión A BBDD y insert de datos
        try {
            connection = DriverManager.getConnection("jdbc:mysql://mysql-kev.alwaysdata.net/kev_especiesmarinas", user, password);
            sql = "INSERT INTO raya (especie, tipo, nombre, habitat, sexo, profundidad, pelagico, tiempo_navegacion, nubosidad, fuerza_viento, direccion_viento, hora_llegada, embarcaciones_zona, temperatura_superf, tipo_cebo,parasitos,presencia_anzuelos, num_anzuelos, medidas) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                this.pstatment = connection.prepareStatement(sql);
                this.pstatment.setString(1, mraya.getEspecie());
                this.pstatment.setString(2, mraya.getTipo());
                this.pstatment.setString(3, mraya.getNombre());
                this.pstatment.setString(4, mraya.getHabitat());
                this.pstatment.setString(5, mraya.getSexo());
                this.pstatment.setInt(6, mraya.getProfundidad());
                this.pstatment.setString(7, mraya.getPelagico());
                this.pstatment.setInt(8, mraya.getTiempo_navegacion());
                this.pstatment.setString(9, mraya.getNubosidad());
                this.pstatment.setString(10, mraya.getFuerza_viento());
                this.pstatment.setString(11, mraya.getDireccion_viento());
                this.pstatment.setString(12, mraya.getHora_llegada());
                this.pstatment.setInt(13, mraya.getEmbarcaciones_zona());
                this.pstatment.setInt(14, mraya.getTemperatura_sup());
                this.pstatment.setString(15, mraya.getTipo_cebo());
                this.pstatment.setString(16, mraya.getParasitos());
                this.pstatment.setString(17, mraya.getPrecencia_anzuelos());
                this.pstatment.setInt(18, mraya.getNumero_anzuelos());
                this.pstatment.setString(19, mraya.getMedidas());
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
