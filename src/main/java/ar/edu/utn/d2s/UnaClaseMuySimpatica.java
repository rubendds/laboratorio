package ar.edu.utn.d2s;

import ar.edu.utn.d2s.exceptions.UnaExceptionMuyClaraYPuntual;

/**
 * 
 * Clase a probar Notar que el equals y el hashcode estan sobreescritos para que
 * dos objetos sean iguales si tienen el mismo nombre
 *
 */
public class UnaClaseMuySimpatica {

	private String nombre;
	private int unAtributoFundamental;

	public UnaClaseMuySimpatica() {
		super();
		this.nombre = "";
		this.unAtributoFundamental = 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUnAtributoFundamental() {
		return unAtributoFundamental;
	}

	public void setUnAtributoFundamental(int unAtributoFundamental)
			throws UnaExceptionMuyClaraYPuntual {
		if (unAtributoFundamental < 0) {
			throw new UnaExceptionMuyClaraYPuntual();
		}
		this.unAtributoFundamental = unAtributoFundamental;
	}

	public int unaCuentaSuperAvanzada() {
		return this.nombre.length() + this.unAtributoFundamental;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnaClaseMuySimpatica other = (UnaClaseMuySimpatica) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}