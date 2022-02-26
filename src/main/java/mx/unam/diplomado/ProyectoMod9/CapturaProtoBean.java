package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@SessionScoped
public class CapturaProtoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;
	
	private Integer id_captura_proto;
	private Integer captura_proto_numControlP;
	private String captura_proto_fecExpP;
	private String captura_proto_numInstruP;
	private Integer captura_proto_numNotarioP;
	private String captura_proto_notarioP;
	private String captura_proto_ruta_pdfproto;
	private String captura_proto_otorganteP;
	private String captura_proto_caseFileP;
	private String captura_proto_entityP;
	private String captura_proto_cargoP;
	private String mensaheespuesta;

	@Inject
	private ListaProtoBean listaProtoBean;
	
	@Inject
	private MessageBean messageBean;

	public String getMensaheespuesta() {
		return mensaheespuesta;
	}

	public void setMensaheespuesta(String mensaheespuesta) {
		this.mensaheespuesta = mensaheespuesta;
	}

	public Integer getId_captura_proto() {
		return id_captura_proto;
	}

	public void setId_captura_proto(Integer id_captura_proto) {
		this.id_captura_proto = id_captura_proto;
	}

	public Integer getCaptura_proto_numControlP() {
		return captura_proto_numControlP;
	}

	public void setCaptura_proto_numControlP(Integer captura_proto_numControlP) {
		this.captura_proto_numControlP = captura_proto_numControlP;
	}

	public String getCaptura_proto_fecExpP() {
		return captura_proto_fecExpP;
	}

	public void setCaptura_proto_fecExpP(String captura_proto_fecExpP) {
		this.captura_proto_fecExpP = captura_proto_fecExpP;
	}

	public String getCaptura_proto_numInstruP() {
		return captura_proto_numInstruP;
	}

	public void setCaptura_proto_numInstruP(String captura_proto_numInstruP) {
		this.captura_proto_numInstruP = captura_proto_numInstruP;
	}

	public Integer getCaptura_proto_numNotarioP() {
		return captura_proto_numNotarioP;
	}

	public void setCaptura_proto_numNotarioP(Integer captura_proto_numNotarioP) {
		this.captura_proto_numNotarioP = captura_proto_numNotarioP;
	}

	public String getCaptura_proto_notarioP() {
		return captura_proto_notarioP;
	}

	public void setCaptura_proto_notarioP(String captura_proto_notarioP) {
		this.captura_proto_notarioP = captura_proto_notarioP;
	}

	public String getCaptura_proto_ruta_pdfproto() {
		return captura_proto_ruta_pdfproto;
	}

	public void setCaptura_proto_ruta_pdfproto(String captura_proto_ruta_pdfproto) {
		this.captura_proto_ruta_pdfproto = captura_proto_ruta_pdfproto;
	}

	public String getCaptura_proto_otorganteP() {
		return captura_proto_otorganteP;
	}

	public void setCaptura_proto_otorganteP(String captura_proto_otorganteP) {
		this.captura_proto_otorganteP = captura_proto_otorganteP;
	}

	

	public String getCaptura_proto_caseFileP() {
		return captura_proto_caseFileP;
	}

	public void setCaptura_proto_caseFileP(String captura_proto_caseFileP) {
		this.captura_proto_caseFileP = captura_proto_caseFileP;
	}

	public String getCaptura_proto_entityP() {
		return captura_proto_entityP;
	}

	public void setCaptura_proto_entityP(String captura_proto_entityP) {
		this.captura_proto_entityP = captura_proto_entityP;
	}

	public String getCaptura_proto_cargoP() {
		return captura_proto_cargoP;
	}

	public void setCaptura_proto_cargoP(String captura_proto_cargoP) {
		this.captura_proto_cargoP = captura_proto_cargoP;
	}

	public String registrar() {
		System.out.println("guardando la protocolizacion notariales..");
		messageBean.setMensaje("La nueva protocolizacion se ha guardado");
		
		CapturaProtoModel model = new CapturaProtoModel();
		model.setCaptura_proto_numControlP(captura_proto_numControlP);
		model.setCaptura_proto_fecExpP(captura_proto_fecExpP);
		model.setCaptura_proto_numInstruP(captura_proto_numInstruP);
		model.setCaptura_proto_numNotarioP(captura_proto_numNotarioP);
		model.setCaptura_proto_notarioP(captura_proto_notarioP);
		model.setCaptura_proto_ruta_pdfproto(captura_proto_ruta_pdfproto);
		model.setCaptura_proto_otorganteP(captura_proto_otorganteP);
		model.setCaptura_proto_caseFileP(captura_proto_caseFileP);
		model.setCaptura_proto_entityP(captura_proto_entityP);
		model.setCaptura_proto_cargoP(captura_proto_cargoP);
		
		listaProtoBean.agregar(model);
		for ( CapturaProtoModel v : listaProtoBean.getProtos()) {
			System.out.println(v);
		}
		
		return "index";
		
	}
}