package logica;

import java.util.ArrayList;
import java.util.List;

public class UbicacionAlmacen {
    private static final double CAPACIDAD_MAXIMA = 1250.0; 
    private String id; 
    private Double capacidadOcupada;
    private List<Producto> productos;

    public UbicacionAlmacen(String id, Double capacidadOcupada, List<Producto> productos) {
        this.id = id;
        this.capacidadOcupada = capacidadOcupada;
        this.productos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getCapacidadOcupada() {
        return capacidadOcupada;
    }

    public void setCapacidadOcupada(Double capacidadOcupada) {
        this.capacidadOcupada = capacidadOcupada;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
}
