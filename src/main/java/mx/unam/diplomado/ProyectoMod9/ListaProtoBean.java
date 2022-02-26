package mx.unam.diplomado.ProyectoMod9;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListaProtoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8463063443349736411L;

	private List<CapturaProtoModel> protos;

	public ListaProtoBean() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		this.protos = new ArrayList<CapturaProtoModel>();
	}

	public List<CapturaProtoModel> getProtos() {
		return protos;
	}

	public void setProtos(List<CapturaProtoModel> protos) {
		this.protos = protos;
	}

	public void agregar(CapturaProtoModel capturaProtoModel) {

		protos.add(capturaProtoModel);

	}
}