package co.com.uco.managewood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Departamento")
public class DepartamentoEntity {
    @Id
    private UUID codigo;
    @ManyToOne
    @JoinColumn(name = "pais") //llave foranea de la tabla Pais
    private PaisEntity pais;
    @Column(name = "nombre") // Se puede obviar si es lo mismo como esta el atributo y el tipo de variable
    private String nombre;
	public UUID getCodigo() {
		return codigo;
	}
	public void setCodigo(UUID codigo) {
		this.codigo = codigo;
	}
	public PaisEntity getPais() {
		return pais;
	}
	public void setPais(PaisEntity pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}
