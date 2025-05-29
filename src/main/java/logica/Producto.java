package logica;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private Integer id;
    private String descripcion;
    private String unidadMedida;
    private Boolean estadoStock;
    private List<UbicacionAlmacen> ubicaciones;

    public Producto() {
    }

    public Producto(Integer id, String descripcion, String unidadMedida, Boolean estadoStock, List<UbicacionAlmacen> ubicaciones) {
        this.id = id;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.estadoStock = estadoStock;
        this.ubicaciones = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Boolean getEstadoStock() {
        return estadoStock;
    }

    public void setEstadoStock(Boolean estadoStock) {
        this.estadoStock = estadoStock;
    }

    public List<UbicacionAlmacen> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<UbicacionAlmacen> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
    
    
}
