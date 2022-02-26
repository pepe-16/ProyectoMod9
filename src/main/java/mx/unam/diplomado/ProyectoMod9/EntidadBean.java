package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class EntidadBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	private String entity_entity;
	private String mensaheespuesta;


	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}
	
	
	public String getEntity_entity() {
		return entity_entity;
	}

	public void setEntity_entity(String entity_entity) {
		this.entity_entity = entity_entity;
	}

	public String registrar() {
		System.out.println("guardando entidad " + entity_entity);
		messageBean.setMensaje("La nueva entidad se ha guardado....");
		return "index";
	}
}
