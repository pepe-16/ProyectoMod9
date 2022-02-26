package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class CargoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	private String cargo_cargo;
	private String mensaheespuesta;


	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}
	
	public String getCargo_cargo() {
		return cargo_cargo;
	}

	public void setCargo_cargo(String cargo_cargo) {
		this.cargo_cargo = cargo_cargo;
	}
	

	public String registrar() {
		System.out.println("guardando cargo " + cargo_cargo);
		messageBean.setMensaje("El nuevo cargo se ha guardado");
		return "index";
	}
}
