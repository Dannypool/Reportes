package mx.com.ragna.dto.ent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="juegos")
public class JuegosEnt {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id_juegos", nullable=false)
	private Integer idJuegos;
	@Column(name="titulo", nullable=true)
	private String titulo;
	@Column(name="descripcion", nullable=true)
	private String descripcion;
	@Column(name="cantidad", nullable=true)
	private Integer cantidad;
	
	
	public Integer getIdJuegos() {
		return idJuegos;
	}
	public void setIdJuegos(Integer idJuegos) {
		this.idJuegos = idJuegos;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
