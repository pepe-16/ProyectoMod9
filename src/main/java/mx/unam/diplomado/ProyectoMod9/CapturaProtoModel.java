package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

public class CapturaProtoModel implements Serializable {

	private static final long serialVersionUID = 1L;

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

	@Override
	public String toString() {
		return "CapturaProtoModel [captura_proto_numControlP=" + captura_proto_numControlP + ", captura_proto_fecExpP="
				+ captura_proto_fecExpP + ", captura_proto_numInstruP=" + captura_proto_numInstruP
				+ ", captura_proto_numNotarioP=" + captura_proto_numNotarioP + ", captura_proto_notarioP="
				+ captura_proto_notarioP + ", captura_proto_ruta_pdfproto=" + captura_proto_ruta_pdfproto
				+ ", captura_proto_otorganteP=" + captura_proto_otorganteP + ", captura_proto_caseFileP="
				+ captura_proto_caseFileP + ", captura_proto_entityP=" + captura_proto_entityP
				+ ", captura_proto_cargoP=" + captura_proto_cargoP + "]";
	}

}
