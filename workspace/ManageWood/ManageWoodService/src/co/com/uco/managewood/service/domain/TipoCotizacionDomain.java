package co.com.uco.managewood.service.domain;

import java.util.UUID;

public class TipoCotizacionDomain {

    private UUID codigo;
    private String nombre;

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
