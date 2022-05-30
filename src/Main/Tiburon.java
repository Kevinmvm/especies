package Main;

public class Tiburon {

    private String id, especie, tipo, nombre, habitat, sexo,  pelagico, nubosidad,
            fuerza_viento, direccion_viento, hora_llegada, tipo_cebo, parasitos,
            precencia_anzuelos, medidas;
    private int profundidad, tiempo_navegacion, embarcaciones_zona, temperatura_sup, numero_anzuelos;
    /*
    public Tiburon (String especie ,String tipo,String nombre,String habitat,String sexo, String pelagico,
                 String nubosidad,String fuerza_viento,String direccion_viento,String hora_llegada,
                 String tipo_cebo, String parasitos, String precencia_anzuelos,String medidas,
                 int profundidad, int tiempo_navegacion, int embarcaciones_zona,
                 int temperatura_sup, int numero_anzuelos){
        this.especie = especie;
        this.tipo = tipo;
        this.nombre = nombre;
        this.habitat = habitat;
        this.sexo = sexo;
        this.profundidad = profundidad;
        this.pelagico = pelagico;
        this.tiempo_navegacion = tiempo_navegacion;
        this.nubosidad = nubosidad;
        this.fuerza_viento = fuerza_viento;
        this.direccion_viento = direccion_viento;
        this.hora_llegada = hora_llegada;
        this.embarcaciones_zona = embarcaciones_zona;
        this.temperatura_sup = temperatura_sup;
        this.tipo_cebo = tipo_cebo;
        this.parasitos = parasitos;
        this.precencia_anzuelos = precencia_anzuelos;
        this.numero_anzuelos = numero_anzuelos;
        this.medidas = medidas;
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPelagico() {
        return pelagico;
    }

    public void setPelagico(String pelagico) {
        this.pelagico = pelagico;
    }

    public String getNubosidad() {
        return nubosidad;
    }

    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    public String getFuerza_viento() {
        return fuerza_viento;
    }

    public void setFuerza_viento(String fuerza_viento) {
        this.fuerza_viento = fuerza_viento;
    }

    public String getDireccion_viento() {
        return direccion_viento;
    }

    public void setDireccion_viento(String direccion_viento) {
        this.direccion_viento = direccion_viento;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public String getTipo_cebo() {
        return tipo_cebo;
    }

    public void setTipo_cebo(String tipo_cebo) {
        this.tipo_cebo = tipo_cebo;
    }

    public String getParasitos() {
        return parasitos;
    }

    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    }

    public String getPrecencia_anzuelos() {
        return precencia_anzuelos;
    }

    public void setPrecencia_anzuelos(String precencia_anzuelos) {
        this.precencia_anzuelos = precencia_anzuelos;
    }

    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getTiempo_navegacion() {
        return tiempo_navegacion;
    }

    public void setTiempo_navegacion(int tiempo_navegacion) {
        this.tiempo_navegacion = tiempo_navegacion;
    }

    public int getEmbarcaciones_zona() {
        return embarcaciones_zona;
    }

    public void setEmbarcaciones_zona(int embarcaciones_zona) {
        this.embarcaciones_zona = embarcaciones_zona;
    }

    public int getTemperatura_sup() {
        return temperatura_sup;
    }

    public void setTemperatura_sup(int temperatura_sup) {
        this.temperatura_sup = temperatura_sup;
    }

    public int getNumero_anzuelos() {
        return numero_anzuelos;
    }

    public void setNumero_anzuelos(int numero_anzuelos) {
        this.numero_anzuelos = numero_anzuelos;
    }
}
