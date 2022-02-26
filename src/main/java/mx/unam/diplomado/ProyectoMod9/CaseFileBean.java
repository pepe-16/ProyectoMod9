package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class CaseFileBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	private String caseFile_caseFile;
	private String mensaheespuesta;


	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}

	public String getCaseFile_caseFile() {
		return caseFile_caseFile;
	}

	public void setCaseFile_caseFile(String caseFile_caseFile) {
		this.caseFile_caseFile = caseFile_caseFile;
	}

	public String registrar() {
		System.out.println("guardando el tipo de archivo " + caseFile_caseFile);
		messageBean.setMensaje("El nuevo tipo de archivo se ha guardado");
		return "index";
	}
}