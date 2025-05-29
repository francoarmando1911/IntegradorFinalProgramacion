package logica;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private String nombre;
    private List<Zona> zonas;

    public Nave(String nombre, List<Zona> zonas) {
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(List<Zona> zonas) {
        this.zonas = zonas;
    }
    
}
