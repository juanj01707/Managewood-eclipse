package co.com.uco.managewood.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cliente") //El nomnbre en como se va a poner en la base de datos
public class ClienteEntity {
    @Id
    @Column(name = "codigo") // Se puede obviar si es lo mismo como esta el atributo y el tipo de variable
    private UUID codigo;
    //@Column (name = "nombre")  -> // Se puede obviar si es lo mismo como esta el atributo y el tipo de variable
    private String nombre;
    private String identificacion;
    private String celular;
    private String correo;
    @ManyToOne
    @JoinColumn(name = "tipoIdentificacion") //llave foranea de la tabla Departamento
    private TipoIdentificacionEntity tipoIdentificacion;
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
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
    
    
    
}
