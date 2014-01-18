package mx.com.ragna.dto.ent;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="p_Usuario")
public class UsuarioEnt {
	private Integer idUsuario;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String usuario;
	private String eMail;
	private String usuarioFace;
	private String usuarioTwitter;
	private String tipoUsuario;
	private String situacion;
	private String creadoPor;
	private Timestamp fCreacion;
	private String actualizadoPor;
	private Timestamp fActualizacion;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id_usuario", nullable=false)
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	@Column(name="nombre", nullable=true)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(name="ap_pat", nullable=true)
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	@Column(name="ap_mat", nullable=true)
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	@Column(name="nombre_usuario", nullable=true)
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	@Column(name="email", nullable=true)
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Column(name="usuario_face", nullable=true)
	public String getUsuarioFace() {
		return usuarioFace;
	}
	public void setUsuarioFace(String usuarioFace) {
		this.usuarioFace = usuarioFace;
	}
	@Column(name="usuario_twitter", nullable=true)
	public String getUsuarioTwitter() {
		return usuarioTwitter;
	}
	public void setUsuarioTwitter(String usuarioTwitter) {
		this.usuarioTwitter = usuarioTwitter;
	}
	@Column(name="tipo_usuario", nullable=true)
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	@Column(name="situacion", nullable=false)
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	@Column(name="creado_por", nullable=false)
	public String getCreadoPor() {
		return creadoPor;
	}
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}
	@Column(name="f_creacion", nullable=false)
	public Timestamp getfCreacion() {
		return fCreacion;
	}
	public void setfCreacion(Timestamp fCreacion) {
		this.fCreacion = fCreacion;
	}
	@Column(name="actualizado_pot", nullable=true)
	public String getActualizadoPor() {
		return actualizadoPor;
	}
	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}
	@Column(name="f_actualizacion", nullable=true)
	public Timestamp getfActualizacion() {
		return fActualizacion;
	}
	public void setfActualizacion(Timestamp fActualizacion) {
		this.fActualizacion = fActualizacion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UsuarioEnt [idUsuario=");
		builder.append(idUsuario);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apPaterno=");
		builder.append(apPaterno);
		builder.append(", apMaterno=");
		builder.append(apMaterno);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", eMail=");
		builder.append(eMail);
		builder.append(", usuarioFace=");
		builder.append(usuarioFace);
		builder.append(", usuarioTwitter=");
		builder.append(usuarioTwitter);
		builder.append(", tipoUsuario=");
		builder.append(tipoUsuario);
		builder.append(", situacion=");
		builder.append(situacion);
		builder.append(", creadoPor=");
		builder.append(creadoPor);
		builder.append(", fCreacion=");
		builder.append(fCreacion);
		builder.append(", actualizadoPor=");
		builder.append(actualizadoPor);
		builder.append(", fActualizacion=");
		builder.append(fActualizacion);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
