package logica;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private String tipo; 
    private List<Estanteria> estanterias;

    public Zona(String nombre, String tipo, List<Estanteria> estanterias) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.estanterias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(List<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }
    
}
