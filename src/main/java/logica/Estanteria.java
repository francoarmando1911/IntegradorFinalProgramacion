package logica;

import java.util.ArrayList;
import java.util.List;

public class Estanteria {
    private String nombre;
    private List<Nivel> niveles;

    public Estanteria(String nombre, List<Nivel> niveles) {
        this.nombre = nombre;
        this.niveles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Nivel> getNiveles() {
        return niveles;
    }

    public void setNiveles(List<Nivel> niveles) {
        this.niveles = niveles;
    }
}
