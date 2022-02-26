package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class PoderBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	private String poder_poder;
	private String mensaheespuesta;


	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}

	public String getPoder_poder() {
		return poder_poder;
	}

	public void setPoder_poder(String poder_poder) {
		this.poder_poder = poder_poder;
	}

	public String registrar() {
		System.out.println("guardando poder " + poder_poder);
		messageBean.setMensaje("El nuevo poder se ha guardado....");
		return "index";
	}
}
