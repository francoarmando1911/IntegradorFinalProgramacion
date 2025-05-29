package logica;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    
    private String nombre; 
    private List<UbicacionAlmacen> ubicaciones;

    public Nivel(String nombre, List<UbicacionAlmacen> ubicaciones) {
        this.nombre = nombre;
        this.ubicaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<UbicacionAlmacen> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<UbicacionAlmacen> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
    
    
}
